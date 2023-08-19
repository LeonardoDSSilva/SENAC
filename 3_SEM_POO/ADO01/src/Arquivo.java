import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Arquivo {
	public FileReader lerArquivo(String nomeArquivo) {
		try {
			FileReader arquivo = new FileReader(nomeArquivo);
			return arquivo;
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			return null;
		}
	}

	public void salvarArquivo(String conteudo) {
        String arquivoDeSaida = "src/_files/saida.txt";
		try {
			FileWriter arquivo = new FileWriter(arquivoDeSaida);
			BufferedWriter escritor = new BufferedWriter(arquivo);
			escritor.write(conteudo);
			escritor.close();
		} catch (Exception e) {
			System.out.println("Erro ao salvar o arquivo");
		}
	}
}
