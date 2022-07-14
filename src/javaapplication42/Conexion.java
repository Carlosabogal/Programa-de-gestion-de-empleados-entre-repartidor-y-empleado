package javaapplication42;

import java.sql.*; //Importa todos los métodos de la librería java

public class Conexion {

    Connection conectar = null; //Atributo conectar que es de la clase Connetion (Similar String x, int x, etc).
    
    public Connection conectar () //Método que retorna un tipo de dato (similar a un get), misma clase del atributo (Connection)
    {
        try {
            //Class.forName("org.sqlite.JDBC"); //Le está diciendo a java que va a utilizar el motor SQLite
            Class.forName("com.mysql.jdbc.Driver"); //Le está diciendo a java que va a utilizar el motor SQLite
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/notascurso","root", ""); //Después de los : pone el nombre del archivo y la extención es la misma como se va a guardar el proyecto desde SQLite, es lo único que se debe cambiar al copiar y pegar código.
        } //Linea anterior debe poner ruta completa donde está el archivo
        catch (Exception e) 
        {            
            System.out.println(e.getMessage());
        }
        
        return conectar;
    }

}
