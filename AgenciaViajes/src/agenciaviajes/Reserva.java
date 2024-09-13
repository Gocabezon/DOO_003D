/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenciaviajes;

/**
 *
 * @author Cetecom
 */
public class Reserva {
    private Vuelo vuelo;
    private String asientoReservado;

    public Reserva() {
    }

    public Reserva(Vuelo vuelo, String asientoReservado) {
        this.vuelo = vuelo;
        this.asientoReservado = asientoReservado;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getAsientoReservado() {
        return asientoReservado;
    }

    public void setAsientoReservado(String asientoReservado) {
        this.asientoReservado = asientoReservado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "vuelo=" + vuelo + ", asientoReservado=" + asientoReservado + '}';
    }
    
    
}
