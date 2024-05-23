package exemplo04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class UsaFuncionario {
	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();

		lista.add(new Funcionario("1", "Prof", 2236));
		lista.add(new Funcionario("2", "Prof", 2236));
		lista.add(new Funcionario("3", "Prof", 2236));


		Consumer<Funcionario> consumer = (Funcionario f) -> System.out.println(f);

		Consumer<Funcionario> consumer2 = new Consumer<Funcionario>() {
			@Override
			public void accept(Funcionario f) {
				System.out.println(f);
			}
		};

		lista.forEach(consumer);
		
	}

}
