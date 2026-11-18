/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.entidades;

/**
 *
 * @author alumnog
 */
public class Registro {
    private int id;
   private Jugador jugador;
    private Torneo torneo;
    private boolean estado;
    private double costo; 
    private double premio;
    
    public Registro() {
    }

    public Registro(Jugador jugador, Torneo torneo, boolean estado, double costo, double premio) {
        this.jugador = jugador;
        this.torneo = torneo;
        this.estado = estado;
        this.costo = costo;
        this.premio = premio;
    }

    public Registro(int id, Jugador jugador, Torneo torneo, boolean estado, double costo, double premio) {
        this.id = id;
        this.jugador = jugador;
        this.torneo = torneo;
        this.estado = estado;
        this.costo = costo;
        this.premio = premio;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registro{");
        sb.append("jugador=").append(jugador);
        sb.append(", torneo=").append(torneo);
        sb.append(", estado=").append(estado);
        sb.append(", costo=").append(costo);
        sb.append(", premio=").append(premio);
        sb.append('}');
        return sb.toString();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }
    
    
    
 
}
