package loja;

import padrao.*;

public class Loja {
    public static void main(String[] args) throws Exception {

        Fachada fachada = Fachada.getInstancia();

        // Cadastro do cliente
        fachada.cadastrar();
       

        //Lista de produtos
        fachada.realizarComprar();

        fachada.exibir();
       

    }
}
