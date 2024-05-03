package gerenciador;

import modelo.Tarefa;

public class Gerenciador {
    public static void main(String[] args) throws Exception {

        Tarefa tarefa = new Tarefa("Criar relatorio");
        tarefa.acionarTarefaPendente();
        tarefa.acionarTarefaAtrasada();
        tarefa.acionarTarefaConcluida();
        tarefa.acionarTarefaPendente();
    
    }
}
