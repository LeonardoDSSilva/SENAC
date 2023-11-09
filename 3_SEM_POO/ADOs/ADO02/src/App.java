import enums.Genero;
import models.CatalogoDeLivros;
import models.RegistroDeEmprestimos;
import models.RegistroDeUsuarios;

public class App {
    public static void main(String[] args) throws Exception {
        

        System.out.println("Seja bem vindo ao sistema de biblioteca!");

        System.out.println("Cadastrando usuários...");
        RegistroDeUsuarios registroDeUsuarios = new RegistroDeUsuarios();
        registroDeUsuarios.adicionarUsuario("João", 1);
        registroDeUsuarios.adicionarUsuario("Maria", 2);

        System.out.println("Listando usuários...");
        registroDeUsuarios.listarUsuarios();


        System.out.println("Cadastrando livros...");
        CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();

        catalogoDeLivros.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, Genero.FANTASIA);
        catalogoDeLivros.adicionarLivro("Guerra e Paz", "Liev Tolstói", 1869, Genero.DRAMA);
        catalogoDeLivros.adicionarLivro("Amor nos Tempos do Cólera", "Gabriel García Márquez", 1985, Genero.ROMANCE);
        catalogoDeLivros.adicionarLivro("O Conde de Monte Cristo", "Alexandre Dumas", 1844, Genero.ACAO);
        catalogoDeLivros.adicionarLivro("O Fantasma da Ópera", "Gaston Leroux", 1910, Genero.TEATRO);

        System.out.println("Listando livros...");
        catalogoDeLivros.listarLivros();

        RegistroDeEmprestimos registroDeEmprestimos = new RegistroDeEmprestimos();
        System.out.println("Emprestando livros...");
        registroDeEmprestimos.adicionarEmprestimo(1, 1);
        registroDeEmprestimos.adicionarEmprestimo(2, 1);
        registroDeEmprestimos.adicionarEmprestimo(3, 2);

        System.out.println("Listando empréstimos...");
        registroDeEmprestimos.listarEmprestimos();


    }
}
