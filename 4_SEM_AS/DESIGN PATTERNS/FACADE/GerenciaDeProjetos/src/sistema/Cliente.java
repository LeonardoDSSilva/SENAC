package sistema;

/*
 *  Professor Gerson Risso
 */
public class Cliente {
private String nome;
    private long id;

    public Cliente() {
    }

    public Cliente(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public Cliente pesquisarClienteId(long id) {
        for (Cliente c : BaseDados.listaClientes) {
            if (c.id == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", id=" + id + '}';
    }

}
