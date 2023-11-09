package enums;
public enum Genero {
	DRAMA("Drama"),
	ACAO ("Ação"),
	ROMANCE ("Romance"),
	TEATRO ("Teatro"),
	FANTASIA ("Fantasia");

	private String genero;

	Genero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public static Genero getGenero(String genero) {
		for (Genero g : Genero.values()) {
			if (g.getGenero().equals(genero)) {
				return g;
			}
		}
		return null;
	}
	
}
