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
import mx.itson.torneospadel.controladores.ClubController;
import mx.itson.torneospadel.entidades.Club;
import mx.itson.torneospadel.entidades.Torneo;

/**
 *
 * @author alumnog
 */
public class TorneoModel {
    Conexion con = new Conexion();
    ClubController clubController = new ClubController();
    
    public boolean crear(Torneo torneo){
        try {
            con.query("INSERT INTO torneos(nombre,club_id, fecha,precio, nivel)"
            + " values ('"+torneo.getNombre()+"','"+torneo.getClub().getId()+"','"+torneo.getFecha()+"','"+torneo.getPrecio()+"','"+torneo.getNivel()+")");
     return true;
        } catch (Exception e) { 
     return false;       
        }
    }
    
    public boolean editar(Torneo torneo){
        try {
        con.query("UPDATE torneos SET "
                + "nombre='"+torneo.getNombre()+"',"
                + "club_id='"+torneo.getClub().getId()+"'," 
                + "nivel="+torneo.getNivel()+","
                + "precio='"+torneo.getPrecio()+"',"
                + "fecha='"+torneo.getFecha()+"'  "
                + "WHERE id ='"+torneo.getId()+"' ");
            return true;    
        } catch (Exception e) {
            return false;
        }
        //                + "club='"+torneo.getClub().getId()+"'," 

    }
    
    public boolean eliminar(Torneo torneo){
        try {
          int r=con.query("DELETE FROM torneos where id ="+torneo.getId());
            System.out.println(r);
          return true;
        } catch (Exception e) {
          return false;
        }
    }
    
    public ArrayList<Torneo> listar(){ 
            ArrayList<Torneo> lista = new ArrayList<>(); 
            ResultSet rs = con.select( "SELECT * FROM torneos"); 
            try {
                while(rs.next()){ 
                    lista.add(new Torneo(
                            rs.getString("nombre"),
                            clubController.getForID( rs.getInt("club_id") ),
                            rs.getString("fecha"),
                            rs.getDouble("precio"),
                            rs.getInt("nivel")
                    ));
                }
            } catch (SQLException ex) {
                Logger.getLogger(JugadorModel.class.getName()).log(Level.SEVERE, null, ex);
            }        
            return lista;        
        }

        public void ver(){}
    }
