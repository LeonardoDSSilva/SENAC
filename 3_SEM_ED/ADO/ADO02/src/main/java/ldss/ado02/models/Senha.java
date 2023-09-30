
package ldss.ado02.models;

import java.time.LocalTime;

public class Senha {

	private String senha;
	// private enum tipoSenha {NORMAL, PREFERENCIAL};
	private String tipoSenha;
	private LocalTime horaGeracao;
	
	public Senha() {
	}

	public Senha(String senha, String tipoSenha, LocalTime horaGeracao) {
		this.senha = senha;
		this.tipoSenha = tipoSenha;
		this.horaGeracao = horaGeracao;
	}

	public String getSenha() {
		return senha;
	}

	public String getTipoSenha() {
		return tipoSenha;
	}

	public LocalTime getHoraGeracao() {
		return horaGeracao;
	}
}
