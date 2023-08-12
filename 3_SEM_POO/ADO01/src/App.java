import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        String pibFile = "src/_files/pib.txt";
        String regiao = "src/_files/regiao.txt";
        
        Ado ado = new Ado();
        Map<String, Double> pib = ado.obterPib(pibFile);

        ado.exibirPibPerCapita(pib);
        // ado.salvarPorRegiao(pib, regiao);
    }

    // public static void readFile(String path){
    //     String linha = null;
    //     String[] dados = null;
    //     Map<String, Double> pib = new HashMap<String, Double>();
    //     try {
    //         FileReader file = new FileReader(path);
    //         BufferedReader conteudo = new BufferedReader(file);
    //         while ((linha = conteudo.readLine()) != null) {
    //             dados = linha.split(";");
    //             pib.put(dados[0], Double.parseDouble(dados[1]));
    //             // System.out.println("Estado: " + dados[0] + " - PIB: " + dados[1]);
    //         }

    //     } catch (FileNotFoundException e) {
    //         System.out.println("Arquivo não Encontado !!");
    //         e.printStackTrace();
    //     } catch (IOException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }

        
    //     // Somando o PIB
    //     double soma = 0;
    //     for (Map.Entry<String, Double> entry : pib.entrySet()) {
    //         soma += entry.getValue();
    //     }
    //     System.out.println("Soma do PIB: " + soma);

    //     for (Map.Entry<String, Double> entry : pib.entrySet()) {
    //         System.out.printf("Estado: %s - PIB: %.2f - %.2f %%\n", entry.getKey(), entry.getValue(), (entry.getValue() / soma) * 100);
    //     } 
    // }
}
