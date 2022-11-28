package ex03;

public class Carro {
	 boolean estado;
	 int marcha = 0;

	 public void ligar() {
		estado = true;
	 }

	 public void desligar() {
		estado = false;
	 }

	 public void exibirEstado() {
		 System.out.println("Estado atual do carro: "+ ((estado) ? "ligado" : "desligado" ));
	 }

}
