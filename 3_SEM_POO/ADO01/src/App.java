public class App {
    public static void main(String[] args) {

        String pibFile = "src/_files/pib.txt";
        String regioes = "src/_files/regiao.txt";
        
        Ado ado = new Ado(pibFile);
        ado.exibirPibPerCapita();
        System.out.println();
        ado.salvarPorRegiao(regioes);
    }
}
