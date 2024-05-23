package sistema;

/*
 *  Professor Gerson Risso
 */
public class Gerente {

    private String nome;
    private int id;

    public Gerente() {
    }

    public Gerente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Gerente pesquisarGerenteId(int id) {
        for (Gerente g : BaseDados.listaGerentes) {
            if (g.id == id) {
                return g;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Gerente{" + "nome=" + nome + ", id=" + id + '}';
    }

}
