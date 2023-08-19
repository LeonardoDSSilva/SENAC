import java.util.List;

public class App {
    public static void main(String[] args) {

        String pibFile = "src/_files/pib.txt";
        String regiao = "src/_files/regiao.txt";
        
        Ado ado = new Ado();
        List<EstadoPIB> estados = ado.obterPib(pibFile);

        ado.exibirPibPerCapita(estados);
        System.out.println();
        ado.salvarPorRegiao(estados, regiao);
    }
}
