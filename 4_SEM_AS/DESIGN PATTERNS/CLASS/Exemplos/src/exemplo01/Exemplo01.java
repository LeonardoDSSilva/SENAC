package exemplo01;

import exemplo01.Externa.Interna;

public class Exemplo01 {
	public static void main(String[] args) {
		Externa externa = new Externa();
		externa.exibir();
		Interna interna = externa.new Interna();
		interna.exibir();
	}
}
