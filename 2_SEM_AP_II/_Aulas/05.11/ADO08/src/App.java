import ADO08.*;

public class App {
    public static void main(String[] args) {


        // Criando 10 animais diferentes entre cachorros, gatos e galinhas
        Animal Scooby = new Cachorro("Scooby", 7);
        Animal Tom = new Gato("Tom", 5);
        Animal GalinhaPintadinha = new Galinha("Galinha Pintadinha", 10);
        Animal Doguinho = new Cachorro("Doguinho", 2);
        Animal Garfield = new Gato("Garfield", 3);
        Animal GalinhaRuiva = new Galinha("Galinha Ruiva", 1);
        Animal Rex = new Cachorro("Rex", 4);
        Animal Frajola = new Gato("Frajola", 6);
        Animal GalinhaGorda = new Galinha("Galinha Gorda", 8);
        Animal Bidu = new Cachorro("Bidu", 9);

        Animal[] animais = new Animal[10];
        animais[0] = Scooby;
        animais[1] = Tom;
        animais[2] = GalinhaPintadinha;
        animais[3] = Doguinho;
        animais[4] = Garfield;
        animais[5] = GalinhaRuiva;
        animais[6] = Rex;
        animais[7] = Frajola;
        animais[8] = GalinhaGorda;
        animais[9] = Bidu;

        // Percorrendo o array de animais e emitindo o som de cada um
        System.out.println();
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
