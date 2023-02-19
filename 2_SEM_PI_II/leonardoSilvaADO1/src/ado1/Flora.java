package ado1;

public class Flora {
	public static void main(String[] args) {
		
		Leopardo leopardo01 = new Leopardo();
		leopardo01.setRegiao("Asia");
		leopardo01.setHabitat("Floresta Tropical");
		System.out.println("Nome: " + leopardo01.getNome() + " \t Regiao: " + leopardo01.getRegiao() + " \t Habitat: " + leopardo01.getHabitat());

		Leopardo leopardo02 = new Leopardo("África", "Savana");
		System.out.println("Nome: " + leopardo02.getNome() + " \t Regiao: " + leopardo02.getRegiao() + "  Habitat: " + leopardo02.getHabitat());

	}
}
