/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ldss.lojainformatica.model;

/**
 *
 * @author ldss1
 */
public class Computador {

    private int idComputador;
    private String marca = "LeonardoSilva";
    private String hd;
    private String processador;

    public Computador() {
    }

    public Computador(String marca, String hd, String processador) {
        this.marca = marca;
        this.hd = hd;
        this.processador = processador;
    }

    public Computador(int idComputador, String marca, String hd, String processador) {
        this.idComputador = idComputador;
        this.marca = marca;
        this.hd = hd;
        this.processador = processador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public int getIdComputador() {
        return idComputador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

}
