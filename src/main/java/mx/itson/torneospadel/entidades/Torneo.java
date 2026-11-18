/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.entidades;

/**
 *
 * @author alumnog
 */
public class Torneo {
    private int id;
    private String nombre;
    private Club club;
    private String fecha;
    private double precio;
    private int nivel;

    public Torneo() {
    }

    public Torneo(String nombre, Club club, String fecha, double precio, int nivel) {
        this.nombre = nombre;
        this.club = club;
        this.fecha = fecha;
        this.precio = precio;
        this.nivel = nivel;
    }

    public Torneo(int id, String nombre, Club club, String fecha, double precio, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.club = club;
        this.fecha = fecha;
        this.precio = precio;
        this.nivel = nivel;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Torneo{");
        sb.append("nombre=").append(nombre);
        sb.append(", club=").append(club);
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

 
    
    
}
