package sistema;

/*
 *  Professor Gerson Risso
 */
public class Projeto {

    private String nome, dataInicio, dataFim;
    private int id;

    public Projeto() {
    }

    public Projeto(String nome, String dataInicio, String dataFim, int id) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.id = id;
    }

    public Projeto pesquisarProjetoId(int id) {
        for (Projeto p : BaseDados.listaProjetos) {
            if (p.id == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Projeto{" + "nome=" + nome + ", dataInicio="
                + dataInicio + ", dataFim=" + dataFim + ", id=" + id + '}';
    }

}
