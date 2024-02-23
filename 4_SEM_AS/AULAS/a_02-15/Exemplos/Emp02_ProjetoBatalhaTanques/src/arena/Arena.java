package arena;

import tanqueRobo.*;

public class Arena {
    public static void main(String[] args) throws Exception {
        TanqueRobo tanque = new TanqueRobo(0, 0, "Tanque", CoresRGB.RED, CoresRGB.GREEN);
        tanque.movLeste();
        tanque.movLeste();
        tanque.movLeste();
        tanque.movLeste();
        tanque.movLeste();

        tanque.atirar();
        
        try {
            tanque.atirar(6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(tanque);
    }
}
