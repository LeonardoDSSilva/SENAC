import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Arquivo {
	public BufferedReader lerArquivo(String nomeArquivo) {
		try {
			FileReader arquivo = new FileReader(nomeArquivo);
			BufferedReader leitor = new BufferedReader(arquivo);
			return leitor;
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			return null;
		}
	}

	public void salvarArquivo(String nomeArquivo, String conteudo) {
		try {
			FileWriter arquivo = new FileWriter(nomeArquivo);
			BufferedWriter escritor = new BufferedWriter(arquivo);
			escritor.write(conteudo);
			escritor.close();
		} catch (Exception e) {
			System.out.println("Erro ao salvar o arquivo");
		}
	}
}
