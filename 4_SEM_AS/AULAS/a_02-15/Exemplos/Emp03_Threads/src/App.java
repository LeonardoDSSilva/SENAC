public class App {
    public static void main(String[] args) {

        NumerosPares numerosPares = new NumerosPares();
        NumerosImpares numerosImpares = new NumerosImpares();
        MultiploCinco multiploCinco = new MultiploCinco();

        numerosPares.start();
        numerosImpares.run();
        multiploCinco.run();

    }
}
