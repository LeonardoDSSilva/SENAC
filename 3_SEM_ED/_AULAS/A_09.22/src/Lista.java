public class Lista {
    public static void main(String[] args) throws Exception {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();

        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        
        lista.adicionar("Cláudio");
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        
        lista.adicionar("João");
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        
        
        lista.adicionar("Maria");
        lista.adicionar("José");
        lista.adicionar("Pedro");
        lista.adicionar("Paulo");
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());
        System.out.println("Elemento na posição 2 = " + lista.get(2).getElemento());
        
        lista.remover("Cláudio");
        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Inicio da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

    }
}
