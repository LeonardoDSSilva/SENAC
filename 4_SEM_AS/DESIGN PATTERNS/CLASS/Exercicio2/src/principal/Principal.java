package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) throws Exception {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", "Alimento", 15.0));
        produtos.add(new Produto("Feijão", "Alimento", 8.0));
        produtos.add(new Produto("Sal", "Alimento", 2.0));

        Consumer<Produto> exibirDesconto = p -> {
            double preco = p.getPreco();
            preco *= preco > 10.0 ? 0.85 : 0.90;
            p.setPreco(preco);
            System.out.println(p);
        };

        produtos.forEach(exibirDesconto);

    }
}
