package cliente;

import sistema.BaseDados;
import sistema.Projeto;

public class GerenciaProjetos {
    public static void main(String[] args) {
        System.out.println("Gerenciando projetos...");
        BaseDados.inserir();

        Projeto projeto = new Projeto();

        projeto.pesquisarProjetoId(1);

        projeto = projeto.pesquisarProjetoId(1);

        if ( projeto != null) {
            System.out.println(projeto);
        }
        else{
            System.out.println("Nao Achou");
        }




            

    }
}
