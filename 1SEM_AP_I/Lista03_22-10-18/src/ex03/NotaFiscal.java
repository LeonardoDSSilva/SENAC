package ex03;

import java.util.ArrayList;

public class NotaFiscal {
	private static ArrayList<Mecardoria> lista = new ArrayList<Mecardoria>();

	// Método Get
	public static ArrayList<Mecardoria> getLista() {
		return lista;
	}
	
	public static void adicionarNota(Mecardoria mecardoria) {
		lista.add(mecardoria);
	}

	public static String exibirNota() {
		String nota = "";
		int i = 1;
		System.out.println("------------------------------------------");
		System.out.println("   Mercadinho do Tio João - Nota Fiscal   ");
		System.out.println("------------------------------------------");
		for (Mecardoria m : lista) {
			nota += " " + i + "  " + m.imprimirNota() + "\n";
			i++;
		}
		return nota;
	}
}
