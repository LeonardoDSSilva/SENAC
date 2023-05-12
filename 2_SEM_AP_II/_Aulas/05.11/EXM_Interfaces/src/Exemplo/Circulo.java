package Exemplo;

public class Circulo implements AreaCalculavel{
	
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}
}
