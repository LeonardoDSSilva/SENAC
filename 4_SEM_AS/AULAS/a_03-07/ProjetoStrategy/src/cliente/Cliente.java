package cliente;

import modelo.Carga;
import strategy.ABC;
import strategy.CBA;
import strategy.CalcularFrete;
import strategy.XPTO;

public class Cliente {
    public static void main(String[] args) throws Exception {
        Carga carga = new Carga(12, "LIVROS");
        System.out.println(calcularFrete("ABC", carga));
        System.out.println(calcularFrete("CBA", carga));
        System.out.println(calcularFrete("XPTO", carga));
        System.out.println(calcularFrete("FDSS", carga));

    }

    public static double calcularFrete( String nomeEmpresa, Carga carga) {
        CalcularFrete empresa;
        if (nomeEmpresa.equals("ABC")) {
            empresa = new ABC();
            
        } else if (nomeEmpresa.equals("CBA")) {
            empresa = new CBA();
            
        } else if (nomeEmpresa.equals("XPTO")) {
            empresa = new XPTO();
            
        } else {
            throw new IllegalArgumentException("Empresa desconhecida");
        }
        return empresa.calcularFrete(carga);
    }
}
