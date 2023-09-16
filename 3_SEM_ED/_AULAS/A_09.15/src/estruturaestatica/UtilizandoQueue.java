package estruturaestatica;

import java.util.LinkedList;
import java.util.Queue;

public class UtilizandoQueue {
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();

		fila.add(1);
		fila.add(2);
		fila.add(3);

		System.out.println(fila.peek());
		System.out.println(fila.remove());

	}
}
