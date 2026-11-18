 
package mx.itson.torneospadel.asets;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import mx.itson.torneospadel.entidades.Jugador;

 
public class JugadorTableModel extends AbstractTableModel{
    ArrayList<Jugador> jugadores = new ArrayList();
    String [] nombreColumnas;
    
    @Override
    public int getRowCount() {
         return jugadores.size();
    }

    @Override
    public int getColumnCount() {
      return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Jugador jugador = jugadores.get(rowIndex);
        Object r;
        switch (columnIndex) {
            case 0: r= jugador.getId(); break;
            case 1: r= jugador.getNombre(); break;
            case 2: r= jugador.getTelefono();  break;
            case 3: r= jugador.getCorreo();  break;
            case 4: r= jugador.getNivel();  break;
            case 5: r= jugador.getCiudad();  break;
            case 6: r= jugador.getEdad();  break;
            default:r= null; 
        }
        return r;
    }
    
    public Jugador getJugador(int fila){
     return jugadores.get(fila);
    }
    
}
