import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ado {

	private Arquivo arquivo = new Arquivo();
	private double pibTotal = 0;

	public List<EstadoPIB> obterPib(String pathFile){
		List<EstadoPIB> estados = new ArrayList<EstadoPIB>();
		
		try {
			BufferedReader conteudo = new BufferedReader(this.arquivo.lerArquivo(pathFile));
			while (conteudo.ready()) {
				String linha = conteudo.readLine();
				String[] dados = linha.split(";");
				estados.add(new EstadoPIB(dados[0], Double.parseDouble(dados[1])));
			}
			conteudo.close();
		} catch (IOException e) {
			System.out.println("Erro lendo o arquivo !!! ");
		}
		return estados;
	}

	public void obterPibTotal(List<EstadoPIB> estados) {
		double total = 0;
		for (EstadoPIB estado : estados) {
			total += estado.getPib();
		}
		this.pibTotal = total;
	}

	public void exibirPibPerCapita(List<EstadoPIB> estados) {
		obterPibTotal(estados);
		System.out.println("PIB per capita: ");
		for (EstadoPIB estado : estados) {
			System.out.printf(" - %s - PIB: %.2f - %.4f%%\n", estado.getEstado(), estado.getPib(),
					estado.getPib() / this.pibTotal);
		}
	}

	public double obterPibPorRegiao(List<EstadoPIB> estados, String regiao) {
		for (EstadoPIB estado : estados) {
			if (estado.getEstado().equals(regiao.trim())) {
				return estado.getPib();
			}
		}
		return 0;
	}

	public void salvarPorRegiao(List<EstadoPIB> estados, String pathFile) {

		List<EstadoPIB> pibPorRegiao = new ArrayList<EstadoPIB>();

		try {
			BufferedReader conteudo = new BufferedReader(this.arquivo.lerArquivo(pathFile));

			while (conteudo.ready()) {
				String regiao = conteudo.readLine();

				if (regiao.length() > 0) {
					double pibEstado = obterPibPorRegiao(estados, regiao);
					pibPorRegiao.add(new EstadoPIB(regiao, pibEstado));
				}
			}
			conteudo.close();
		} catch (IOException e) {
			System.out.println("Erro lendo o arquivo !!! ");                  
		}
		String conteudoArquivo = "";
		for (EstadoPIB estado : pibPorRegiao) {
			if (estado.getPib() > 0) {
				conteudoArquivo += " - " + estado.getEstado() + ", " + estado.getPib() + "\n";
				System.out.printf(" - %s - PIB: %.2f \n", estado.getEstado(), estado.getPib());
			} else {
				conteudoArquivo += estado.getEstado() + ":\n";
				System.out.println(estado.getEstado() + ":");
			}
		}
		arquivo.salvarArquivo(conteudoArquivo);
	}
}
