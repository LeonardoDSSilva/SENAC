import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ado {
	public Map<String, Double> obterPib(String pathFile){
		Arquivo arquivo = new Arquivo();
		BufferedReader conteudo = arquivo.lerArquivo(pathFile);
		Map<String, Double> pib = new HashMap<String, Double>();
 		try {
			while (conteudo.ready()) {
				String linha = conteudo.readLine();
				String[] dados = linha.split(";");
				pib.put(dados[0], Double.parseDouble(dados[1]));
			}
			conteudo.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pib;
	}

	public double obterPibTotal(Map<String, Double> pib) {
		double pibTotal = 0;
		for (String estado : pib.keySet()) {
			pibTotal += pib.get(estado);
		}
		return pibTotal;
	}

	public void exibirPibPerCapita(Map<String, Double> pib ) {
		double pibTotal = obterPibTotal(pib);
		// Exibir PIB per capita
		System.out.println("PIB per capita: ");
		for (String estado : pib.keySet()) {
			System.out.printf(" - %s - PIB: %.2f - %.2f %% \n", estado, pib.get(estado),
					pib.get(estado) / pibTotal * 100);
		}
	}

	public double obterPibPorRegiao(Map<String, Double> pib, String regiao) {
		for (String estado : pib.keySet()) {
			if (estado.equals(regiao)) {
				return pib.get(estado);
			}
		}
		return 0;
	}

	public void salvarPorRegiao(Map<String, Double> pib, String pathFile) {
		Arquivo arquivo = new Arquivo();
		BufferedReader conteudo = arquivo.lerArquivo(pathFile);
		Map<String, Double> pibPorRegiao = new HashMap<String, Double>();
		try {
			while (conteudo.ready()) {
				String regiao = conteudo.readLine();
				double pibEstado = obterPibPorRegiao(pib, regiao);
				
				
			}
			conteudo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String regiao : pibPorRegiao.keySet()) {
			System.out.printf(" - %s - PIB: %.2f \n", regiao, pibPorRegiao.get(regiao));
		}
	}

}
