 
package mx.itson.torneospadel.controladores;

import java.util.ArrayList;
import mx.itson.torneospadel.entidades.Club;
import mx.itson.torneospadel.modelos.ClubModel;

 
public class ClubController {
    
    ClubModel modelo = new ClubModel();
    
    public void crear(){}
    
    public void editar(){}
    
    public void eliminar(){}
    
    public ArrayList<Club> listar(){
      return modelo.listar();
    }
    
    public Club getForID(int id){
         return modelo.getForID(id);
    }
}
