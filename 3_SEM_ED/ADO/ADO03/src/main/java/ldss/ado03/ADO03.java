package ldss.ado03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ldss.ado03.models.Veiculo;

/**
 *
 * @author ldss1
 */
public class ADO03 {

    public static void main(String[] args) {

       List<Veiculo> veiculos = Veiculo.fromJson("src/main/resources/carros.json");

        //  veiculos.forEach((veiculo) -> {
        //     System.out.println(veiculo.getModelo());
        // });

        // Escolha um veículo aleatório
        int random = (int) (Math.random() * veiculos.size());
        Veiculo modelo = veiculos.get(random);
        
        // Grafo simples não direcionado para representar as recomendações entre os veículos
        Map<Veiculo, List<Veiculo>> recomendacoesGrafo = new HashMap<>();

        // Para cada veículo, verifica se deve recomendar o modelo escolhido
        for (Veiculo veiculo1 : veiculos) {
            recomendacoesGrafo.putIfAbsent(veiculo1, new ArrayList<>());

            for (Veiculo veiculo2 : veiculos) {
                if (deveRecomendar(veiculo1, veiculo2)) {
                    recomendacoesGrafo.get(veiculo1).add(veiculo2);
                }
            }
        }
            
        List<Veiculo> recomendacoesList = recomendacoesGrafo.get(modelo);
        System.out.println("Modelos recomendados para " + modelo.getModelo() + "com autonomia de " + modelo.getAutonomia() + " são:");
        System.out.println();
        if (recomendacoesList != null) {
            recomendacoesList.forEach((veiculo) -> {
                System.out.println(veiculo.getModelo() + " com autonomia de " + veiculo.getAutonomia());
            });
        } else {
            System.out.println("Nenhum modelo recomendado.");
        }
    }


    // O critério é se o segundo veículo tem a autonomia maior que o primeiro.
    public static boolean deveRecomendar(Veiculo veiculo1, Veiculo veiculo2) {
        return Integer.parseInt(veiculo1.getAutonomia().split(" ")[0]) > Integer.parseInt(veiculo2.getAutonomia().split(" ")[0]);
    }


}
