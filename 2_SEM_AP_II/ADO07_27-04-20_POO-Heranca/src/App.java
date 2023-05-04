import ingresso.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Normal
         Normal ingresso = new Normal();
        ingresso.imprimeValor();

        System.out.println();
        // Vip
        Vip ingressoVip = new Vip();
        ingressoVip.imprimeValor();
        
        System.out.println();
        // Camarote Inferior
        CamaroteInferior camaroteInferior = new CamaroteInferior();
        camaroteInferior.imprimirLocalizacao();
        camaroteInferior.imprimirValor();
        
        
        System.out.println();
        // Camarote Superior
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        camaroteSuperior.imprimeValor();
        System.out.println("O valor do camarote superior é: " + camaroteSuperior.exibirValor());
    };
}
