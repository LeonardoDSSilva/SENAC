package cliente;

import composicao.Componente;
import composicao.Composicao;
import composicao.Folha;

public class MontarCesta {
    public static void main(String[] args) throws Exception {
        //Criando a cesta
        Composicao cesta = new Composicao("Cesta de Café da Manhã");

        //Criando os produtos
        Componente p1 = new Folha("Pão", 4.21);
        Componente p2 = new Folha("Café Solúvel", 5.12);
        Componente p3 = new Folha("Leite", 6.99);
        
        //Adicionando os produtos
        cesta.adicionar(p1);
        cesta.adicionar(p2);
        cesta.adicionar(p3);


        //Criando os bombons
        Componente b1 = new Folha("Maracuja", 3.99);
        Componente b2 = new Folha("Morango", 4.99);
        Componente b3 = new Folha("Cereja", 5.99);

        //Criando a cesta de bombons
        Composicao caixaBombons = new Composicao("Caixa de Bombons");

        //Adicionando os bombons
        caixaBombons.adicionar(b1);
        caixaBombons.adicionar(b2);
        caixaBombons.adicionar(b3);

        //Adicionando a caixa de bombons na cesta
        cesta.adicionar(caixaBombons);
        
        //Exibindo o preço da cesta
        System.out.println("Preço da cesta: " + cesta.getPreco());

    }

}
