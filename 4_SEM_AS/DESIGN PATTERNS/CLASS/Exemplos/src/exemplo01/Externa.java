package exemplo01;

public class Externa {
	public void exibir(){
		System.out.println("Classe Externa");
	}
	
	/**
	 * Interna
	 */
	public class Interna {
		public void exibir(){
			System.out.println("Classe Interna");
		}
		
	}
}
