 
package mx.itson.torneospadel.controladores;
 
import java.util.ArrayList;
import mx.itson.torneospadel.entidades.Torneo;
import mx.itson.torneospadel.modelos.TorneoModel;

public class TorneoController {
    TorneoModel modelo = new TorneoModel();
    
    public boolean crear(Torneo torneo){
        return modelo.crear(torneo);
    }
    
    public boolean editar(Torneo torneo){
        return modelo.editar(torneo);
    }
    
    public boolean eliminar(Torneo torneo){
        return modelo.eliminar(torneo);
    }
    
    public ArrayList<Torneo> listar(){
        return modelo.listar();
    }
    
    public void ver(){}
}
