package Exemplo;

public class Quadrado implements AreaCalculavel {
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.lado, 2);
	}
}
