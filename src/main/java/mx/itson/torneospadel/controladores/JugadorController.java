 
package mx.itson.torneospadel.controladores;

import java.util.ArrayList;
import mx.itson.torneospadel.entidades.Jugador;
import mx.itson.torneospadel.modelos.JugadorModel;

 
public class JugadorController {
    
    JugadorModel modelo = new JugadorModel();
    
    public boolean crear(Jugador jugador){ 
       return modelo.crear(jugador); 
    }
    
    public boolean editar(Jugador jugador){ 
        return modelo.editar(jugador); 
    }
    
    public boolean eliminar(Jugador jugador){  
       return modelo.eliminar(jugador); 
    }
    
    public ArrayList<Jugador> listar(){  
        ArrayList<Jugador> lista = modelo.listar();
        return lista; 
    }
    
    public void ver(){}
}
