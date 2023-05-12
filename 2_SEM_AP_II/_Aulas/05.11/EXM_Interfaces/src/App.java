import Exemplo.AreaCalculavel;

public class App {
    public static void main(String[] args) throws Exception {

        AreaCalculavel[] areas = new AreaCalculavel[6];
        
        AreaCalculavel c1 = new Exemplo.Circulo(2);
        AreaCalculavel r1 = new Exemplo.Retangulo(2, 3);
        AreaCalculavel q1 = new Exemplo.Quadrado(2);
        AreaCalculavel c2 = new Exemplo.Circulo(3);
        AreaCalculavel r2 = new Exemplo.Retangulo(3, 4);
        AreaCalculavel q2 = new Exemplo.Quadrado(3);

        areas[0] = c1;
        areas[1] = r1;
        areas[2] = q1;
        areas[3] = c2;
        areas[4] = r2;
        areas[5] = q2;

        for (AreaCalculavel areaCalculavel : areas) {
            System.out.println("A área é: " + areaCalculavel.calcularArea());
        }
    }
}
