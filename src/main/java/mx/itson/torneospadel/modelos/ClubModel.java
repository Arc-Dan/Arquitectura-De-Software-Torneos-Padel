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
import mx.itson.torneospadel.entidades.Club;
import mx.itson.torneospadel.entidades.Jugador;

/**
 *
 * @author alumnog
 */
public class ClubModel {
    
    Conexion con = new Conexion();
    
    
    public boolean crear(Club club){ 
        try {
            con.query("INSERT INTO clubs(nombre,direccion,ciudad,telefono)"
            + " values ('"+club.getNombre()+"','"+club.getDireccion()+"','"+club.getCiudad()+"','"+club.getTelefono()+"')");
     return true;
        } catch (Exception e) { 
     return false;       
        } 
    
    }
    
    public void editar(){}
    
    public void eliminar(){}
    
      public ArrayList<Club> listar(){ 
        ArrayList<Club> lista = new ArrayList<>(); 
        ResultSet rs = con.select( "SELECT * FROM clubs"); 
        try {
            while(rs.next()){ 
                lista.add(new Club(
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getString("ciudad"),
                        rs.getString("telefono")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JugadorModel.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return lista;        
    }
    
    public Club getForID(int id){
    Club club=null;
    ResultSet rs = con.select("SELECT * FROM clubs WHERE id="+id);
    
        try {
            rs.next();
            club = new Club(
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("ciudad"),
                    rs.getString("telefono")
            );
        } catch (SQLException ex) {
            Logger.getLogger(ClubModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return club;
   }
    
    
    
}
