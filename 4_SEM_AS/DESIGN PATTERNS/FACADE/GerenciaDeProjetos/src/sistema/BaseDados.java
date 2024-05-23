package sistema;

import java.util.ArrayList;
import java.util.List;

/*
 *  Professor Gerson Risso
 */
public class BaseDados {

    protected static List<Cliente> listaClientes = new ArrayList<>();
    protected static List<Gerente> listaGerentes = new ArrayList<>();
    protected static List<Projeto> listaProjetos = new ArrayList<>();

    public static void inserir() {

        listaClientes.add(new Cliente("Empresa X", 12));
        listaClientes.add(new Cliente("Empresa ABC", 21));
        listaClientes.add(new Cliente("Empresa XPTO", 34));

        listaGerentes.add(new Gerente("Gerson", 1));
        listaGerentes.add(new Gerente("Jori", 3));
        listaGerentes.add(new Gerente("Daniel", 17));

        listaProjetos.add(new Projeto("PI do Gabriel", "01/04/2022", "01/05/2023", 1));
        listaProjetos.add(new Projeto("PI do Carlos", "01/07/2022", "22/12/2023", 13)); 
    }
}
