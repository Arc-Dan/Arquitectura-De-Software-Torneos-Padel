package mx.itson.torneospadel.entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumnog
 */
public class Jugador {


private int id;
private String nombre;
private String telefono;
private String correo;
private int nivel;
private String ciudad;
private int edad;

//constructores
    public Jugador(String nombre, String telefono, String correo, int nivel, String ciudad, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.nivel = nivel;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public Jugador(int id, String nombre, String telefono, String correo, int nivel, String ciudad, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.nivel = nivel;
        this.ciudad = ciudad;
        this.edad = edad;
    }
    
    
    
    public Jugador() {
    }
         public int getId() {
        return id;
    }

//atributos
    public void setId(int id) {
        this.id = id;
    }

//to string

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jugador{");
        sb.append("nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", correo=").append(correo);
        sb.append(", nivel=").append(nivel);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }    
    

//getter y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }




}
