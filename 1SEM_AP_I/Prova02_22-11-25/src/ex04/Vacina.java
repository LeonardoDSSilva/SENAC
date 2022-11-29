package ex04;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Vacina {
	String nome;
	int quantidade = 100; // Quantidade de vacinas inicial
	int[] dosesAplicadas;

	public Vacina(String string, int dia) {
		nome = string;
		dosesAplicadas = new int[dia];
	}

	public int aplicarDose(int index) {
		if (quantidade > 0) {
			quantidade--;
			dosesAplicadas[index]++;
			exibirComprovante();
			if (quantidade <= 10){
				controlarVacina();
			}
			return 1;
		}else {
			System.out.println("Vacina " + nome + " não tem mais doses disponíveis");
			return 0;
		}
	}

	// public void adquirirVacina(int i) {
	// 	quantidade += i;
	// }

	public int exibirQuantidade() {
		return quantidade;
	}

	public void mostrarDados(boolean resumoDoDia,int index) {
		System.out.println("Nome: " + nome);
		System.out.println("Quantidade no estoque: " + quantidade);

		if (resumoDoDia){
			System.out.println("Doses aplicadas no dia: " + dosesAplicadas[index]);
		}
		else{
			System.out.println("Doses aplicadas por dia: ");
			for (int i = 0; i < dosesAplicadas.length; i++) {
				if (dosesAplicadas[i] > 0){
					System.out.println("Dia " + (i+1) + ": " + dosesAplicadas[i]);
				}
			}
		}
	}

	private void controlarVacina() {
		System.out.println();
		Ex04.exibirLinha();
		System.out.println("Quantidade de vacinas restantes: " + quantidade);
		System.out.println("Doses adquirir " + (100 - quantidade) + " doses da vacina " + nome);
		Ex04.exibirLinha();
	}

	private void exibirComprovante(){
		Ex04.exibirLinha();
		System.out.println("\tComprovante de vacinação");
		System.out.println("Vacina: " + nome);
		
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Data
		System.out.println("Dose aplicada em: " +sdf.format(data));
		// Lote
		Ex04.exibirLinha();
	}
}