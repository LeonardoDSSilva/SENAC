package exm01;

public class ClassePrincipal {
	public static void main(String[] args) {
		TesteParametros obj2 = new TesteParametros();
		MyObj obj = new MyObj();
		int valor1 = 10;
		obj.nome = "Aline";
		obj.idade = 20;

		// passagem de parametros por valor -> Copia o valor
		//Exemplo01
		obj2.receberParametros(valor1);
		//Exemplo02
		obj2.mudarParametros(valor1);
		System.out.println("Imprimindo o valor de valor1: " + valor1);
		
		// passagem de parametros por referencia do objeto -> Copia o endereço de memoria

		obj2.mudarValor2(obj);
		System.out.println("Imprimindo o valor do objeto: " + obj.nome);

	}
}
