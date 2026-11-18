/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.torneospadel.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.itson.torneospadel.entidades.Jugador;

/**
 *
 * @author alumnog
 */
public class JugadorModel {
  
    Conexion con = new Conexion();
    
    public boolean crear(Jugador jugador){ 
        try {
            con.query("INSERT INTO jugadores(nombre,correo, telefono,nivel, ciudad,edad)"
            + " values ('"+jugador.getNombre()+"','"+jugador.getCorreo()+"','"+jugador.getTelefono()+"','"+jugador.getNivel()+"','"+jugador.getCiudad()+"',"+jugador.getEdad()+")");
     return true;
        } catch (Exception e) { 
     return false;       
        } 
    
    }
    
    public boolean editar(Jugador jugador){
        try {
        con.query("UPDATE jugadores SET "
                + "nombre='"+jugador.getNombre()+"',"
                + "correo='"+jugador.getCorreo()+"'," 
                + "nivel="+jugador.getNivel()+","
                + "ciudad='"+jugador.getCiudad()+"',"
                + "edad="+jugador.getEdad()+"  "
                + "WHERE telefono ='"+jugador.getTelefono()+"' ");
            return true;    
        } catch (Exception e) {
            return false;
        } 
    }
    
    public boolean eliminar(Jugador jugador){
        try {
          int r=con.query("DELETE FROM jugadores where telefono ="+jugador.getTelefono());
            System.out.println(r);
          return true;
        } catch (Exception e) {
          return false;
        } 
    }
    
    public ArrayList<Jugador> listar(){
        //lista vacia de jugadores
        ArrayList<Jugador> lista = new ArrayList<>();
        //resulset con los registros de jugadores que encontro en la DB
        ResultSet rs = con.select( "SELECT * FROM jugadores");
        
        try {
            while(rs.next()){
                //por cada registro encontrado en la DB
                //agrega un new Jugador a la lista vacia
                lista.add(new Jugador(
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getInt("nivel"),
                        rs.getString("ciudad"),
                        rs.getInt("edad")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JugadorModel.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return lista;        
    }
     
    public void ver(){}
    
    public void iniciarSesion(){
    
    } 

 
    
}
