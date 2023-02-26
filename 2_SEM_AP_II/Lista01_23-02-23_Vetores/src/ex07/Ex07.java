package ex07;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		double[] salarios = new double[5];
		lerSalarios(salarios);
		exibirMaiorSalario(salarios);
	}

	private static void exibirMaiorSalario(double[] salarios) {
		double maiorSalario = salarios[0];
		int con = 0;
		for(double salario: salarios){
			if(salario > maiorSalario){
				maiorSalario = salario;
			}
			else if(salario == maiorSalario){
				con ++;
			}
		}
		System.out.printf("O maior Salário é de: %.2f %s",maiorSalario, ((con>1)?(", e se repete "+ con + " Vezes"):"")   );
	}

	private static void lerSalarios(double[] salarios) {
		Scanner scNum = new Scanner(System.in);
		for(int i = 0; i < salarios.length; i++){
			System.out.printf("Informe a %dª valor: ", i +1);
			salarios[i] = scNum.nextDouble();
		}
	}
}
