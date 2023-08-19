public class EstadoPIB {
	
	private String estado;
	private double pib;
	
	public EstadoPIB(String estado, double pib) {
		this.estado = estado;
		this.pib = pib;
	}
	
	public String getEstado() {
		return estado.trim();
	}
	
	public double getPib() {
		return pib;
	}
}
