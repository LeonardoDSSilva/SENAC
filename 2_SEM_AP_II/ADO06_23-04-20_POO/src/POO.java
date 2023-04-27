import funcionario.Funcionario;

public class POO {
    public static void main(String[] args) throws Exception {

        Funcionario f1 = new Funcionario();
        f1.setNome("Hugo");
        f1.setSalario(1000);
        f1.recebeAumento(500);
        // f1.setDataEntrada( "12/01/1995");
        f1.setRg("12345678-9");
        f1.mostra();
        System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
        
        System.out.println();



        Funcionario f2 = new Funcionario("Danilo", "12345678-9", "12/01/1995", 1650, "TI");
        f2.mostra();
        System.out.println("Ganho anual: " + f2.calculaGanhoAnual());

    }
}
