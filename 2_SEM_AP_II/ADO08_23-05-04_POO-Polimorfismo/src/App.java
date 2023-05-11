import ado08.*;


public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Rex", 5);
        cachorro.emitirSom();

        Cavalo cavalo = new Cavalo("Pé de Pano", 10);
        cavalo.emitirSom();

        Preguica preguica = new Preguica("Sid", 15);
        preguica.emitirSom();
    }
}
