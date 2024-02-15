import funcionarios.*;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario func = new Funcionario("Ana", 3000);
        Gerente gere = new Gerente("Fer");


        System.out.println(func);
        gere.alteraarSalario(3000, func);

        System.out.println(func);
    }
}
