/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaviajes;

/**
 *
 * @author Cetecom
 */
public class PasajeroFrecuente {
    private String numeroPasajero;
    private Integer puntos;

    public PasajeroFrecuente() {
    }

    public PasajeroFrecuente(String numeroPasajero, Integer puntos) {
        this.numeroPasajero = numeroPasajero;
        this.puntos = puntos;
    }

    public String getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(String numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "PasajeroFrecuente{" + "numeroPasajero=" + numeroPasajero + ", puntos=" + puntos + '}';
    }
    
    
}
