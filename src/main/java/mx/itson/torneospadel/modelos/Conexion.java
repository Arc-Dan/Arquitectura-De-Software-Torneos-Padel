package mx.itson.torneospadel.modelos;


import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion{    


    String usuario ="u45foplwxbgwy";
    String clave="camaronesITSON";
    String url ="jdbc:mysql://pitalla.mx/db3b3p76lp779g?serverTimezone=UTC";
    Connection con;
    Statement stmt;
    ResultSet rs;


    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con = DriverManager.getConnection(url,usuario,clave);
            stmt = con.createStatement(); 
        
        
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public  int    query(String consulta){
        try {
           return stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        return 0;
        }
    }
    
    public  ResultSet   select(String consulta){
        try {
            rs = stmt.executeQuery(consulta);
           
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  rs;
    }
  
       
  public static void main(String[] args){  
     
            Conexion test = new Conexion();
            
          //  test.insert("INSERT INTO tecnicos (nombre, apellido, telefono,correo, contrasena) VALUES ('t2', 't', '67777', '3434d77', '123');");
       
            test.query("INSERT INTO jugadores(nombre,correo, telefono,nivel, ciudad,edad)"
                    + " values ('caro','caro@gmail.com','62214785475','6','obregon',30)");
           
            ResultSet rs = test.select( "SELECT * FROM jugadores");
       try {      
            while(rs.next()){
                System.out.println(rs.getString("id")+" "+rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  } 
     
    
    
}