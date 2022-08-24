package Conexion_BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NAVY-PC
 */

/*
 Esta clase esta diseñada para almacenar la información de conexión MySQL y poder dar conexión desde la aplicación java hacía la BBDD.
 La implementación de esta clase, se realiza mediante el uso del método getConexión. Utilizando variables de tipo Objeto sobre el paquete de JDBC.
 
*/

public class Conexion {
    
    //creamos la variable de tipo connection, la cual nos permitirá abrir y cerrar las conexiones.
    public Connection conexion;
    
    
    public static String connectionUrl = "";

    

    public Connection getConexion(){
        //probamos de establecer conexión con la BBDD
        try{
           
            conexion = DriverManager.getConnection(connectionUrl);
           //capturamos los posibles errores que puedan producirse, al no establecer conexión
        }catch(SQLException e){
            System.out.println("The exception raised is:" + e);
        }
        //devolvemos la conexión.
        return conexion;
    }
    

    
}