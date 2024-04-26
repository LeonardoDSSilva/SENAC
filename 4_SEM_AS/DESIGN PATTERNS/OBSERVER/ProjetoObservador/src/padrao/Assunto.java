package padrao;

public interface Assunto {

	public void adicionar(Observador observador);
	public void setAcao(Acao acao);
	public void notificar();


}
