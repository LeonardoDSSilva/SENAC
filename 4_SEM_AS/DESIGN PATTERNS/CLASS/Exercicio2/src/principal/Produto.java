package principal;

public class Produto {

	private String nome, categoria;
    private Double preco;
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + "]";
	}
	public Produto(String nome, String categoria, Double preco) {
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
	public Produto() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
