package ldss.notepad;

public class Arquivo {
	private String nome;
	private String caminho;
	private String conteudo;
	private Boolean alterado = false;

	
	public Arquivo() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Boolean getAlterado() {
		return alterado;
	}
	public void setAlterado(Boolean alterado) {
		this.alterado = alterado;
	}
	
}
