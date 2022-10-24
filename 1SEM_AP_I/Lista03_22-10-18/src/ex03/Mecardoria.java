package ex03;

public class Mecardoria {

	private double valorUnitario, quantidade;
	private String produto, grandeza;

	public Mecardoria() {
	}
	
	public Mecardoria(String produto, double valorUnitario, double quantidade, String grandeza) {
		this.produto = produto;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
		this.grandeza = grandeza;
	}
	
/* 	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getGrandeza() {
		return grandeza;
	}

	public void setGrandeza(String grandeza) {
		this.grandeza = grandeza;
	} */

	public String imprimirNota() {
	return produto + " \n\t" + quantidade + "  x  " + valorUnitario + grandeza + "\t\t" + (quantidade * valorUnitario);
		}
}
