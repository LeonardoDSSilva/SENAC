package cliente;

import modelo.Carga;

public class Cliente {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static double calcularFrete( String nomeEmpresa, Carga carga) {
        if (nomeEmpresa.equals("ABC")) {
            if (carga.getPeso() <= 10) {
                return 12.56;
            } else if (carga.getPeso() <= 10) {
                return 14.78;
            } else {
                return 17.64;
            }
        } else if (nomeEmpresa.equals("CBA")) {
            if (carga.getPeso() <= 10) {
                return 10.12;
            } else if (carga.getPeso() <= 10) {
                return 12.34;
            } else {
                return 15.09;
            }
        } else if (nomeEmpresa.equals("XPTO")) {
            if (carga.getPeso() <= 10) {
                return 14.77;
            } else if (carga.getPeso() <= 10) {
                return 16.82;
            } else {
                return 18.13;
            }
        } else {
           throw new IllegalArgumentException("Empresa desconhecida");
        }
    }
}
