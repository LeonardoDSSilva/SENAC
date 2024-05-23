package classeAnonima;

public class Teste {
	public static void main(String[] args) {

		Exibir exibir = new Exibir() {
	
			@Override
			public void exibirNome() {
				System.out.println("Leonardo");
			}
	
			@Override
			public void exibirSobreNome() {
				System.out.println("Silva");
			}
			
		};

		exibir.exibirNome();
		exibir.exibirSobreNome();	
		
	}

/* 	Exibir exibir = new Exibir() {

		@Override
		public void exibirNome() {
			System.out.println("Leonardo");
		}

		@Override
		public void exibirSobreNome() {
			System.out.println("Silva");
		}
		
	}; */
}
