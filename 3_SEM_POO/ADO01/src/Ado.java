import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ado {

	private Arquivo arquivo = new Arquivo();
	private double pibTotal = 0;
	private List<EstadoPIB> estados = new ArrayList<EstadoPIB>();

	public Ado(String filePIB) {
		obterPib(filePIB);
	}

	private void obterPib(String pathFile){
		try {
			BufferedReader conteudo = new BufferedReader(this.arquivo.lerArquivo(pathFile));
			while (conteudo.ready()) {
				String linha = conteudo.readLine();
				String[] dados = linha.split(";");
				this.pibTotal += Double.parseDouble(dados[1]);
				this.estados.add(new EstadoPIB(dados[0], Double.parseDouble(dados[1])));
			}
			conteudo.close();
		} catch (IOException e) {
			System.out.println("Erro lendo o arquivo !!! ");
		}
	}

	public void exibirPibPerCapita() {
		System.out.println("PIB per capita: ");
		for (EstadoPIB estado : this.estados) {
			System.out.printf(" - %s - PIB: %.2f - %.2f%%\n", estado.getEstado(), estado.getPib(),
					(estado.getPib() / this.pibTotal) * 100);
		}
	}

	private double obterPibPorRegiao(String regiao) {
		for (EstadoPIB estado : this.estados) {
			if (estado.getEstado().equals(regiao.trim())) {
				return estado.getPib();
			}
		}
		return 0;
	}

	public void salvarPorRegiao(String pathFile) {
		List<EstadoPIB> pibPorRegiao = new ArrayList<EstadoPIB>();
		try {
			BufferedReader conteudo = new BufferedReader(this.arquivo.lerArquivo(pathFile));
			while (conteudo.ready()) {
				String regiao = conteudo.readLine();

				if (regiao.length() > 0) {
					double pibEstado = obterPibPorRegiao(regiao);
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