package Exemplo;

public class Retangulo implements AreaCalculavel {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}
	
}
