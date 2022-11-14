package exm01;

public class TesteParametros {
	public void receberParametros(int num){
		System.out.println("O numero Informado foi: " + num);
	}
	
	public void mudarParametros(int num){
		num = 20;
		System.out.println("O numero Informado foi: " + num);
	}
	public void mudarValor2(MyObj obj){
		obj.nome = "Outro Nome";
	}
}
