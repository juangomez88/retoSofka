package com.retosofka.repositorio;

import com.retosofka.entidades.Juego;

import java.sql.*;

public class RespositorioSqlite {

    public  void crearTabla(){
        try{
            Connection conexion=null;
            Statement statement=null;
            String directorio = System.getProperty("user.dir");
            String url="jdbc:sqlite:"+directorio+System.getProperty("file.separator")+"juego.db";
            conexion= DriverManager.getConnection(url);
            statement=conexion.createStatement();

            String createTable="CREATE TABLE IF NOT EXISTS Juego"+
                                "( id NUMERIC PRIMARY KEY NOT NULL,"+
                                " primerPuesto VARCHAR(50) NOT NULL,"+
                                "segundoPuesto VARCHAR(50) NOT NULL,"+
                                "tercerPuesto VARCHAR(50) NOT NULL)";

            statement.executeUpdate(createTable);
            statement.close();
            conexion.close();
            System.out.println("Se creo la tabla ok.");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void almacenarJuego(Juego juego){
        try {
            Connection conexion=null;
            Statement statement=null;

            String directorio = System.getProperty("user.dir");
            String url="jdbc:sqlite:"+directorio+System.getProperty("file.separator")+"juego.db";
            conexion= DriverManager.getConnection(url);
            statement=conexion.createStatement();

            String insert="INSERT INTO Juego (id,primerPuesto,segundoPuesto,tercerPuesto) VALUES ("
                    +String.valueOf(juego.getCodigo())+",'"+juego.getPodio().getPrimerPuesto().getNombre()
                    +"','"+juego.getPodio().getSegundoPuesto().getNombre()+"','"+juego.getPodio().getTercerPuesto().getNombre()
                    +"');";
            statement.executeUpdate(insert);
            statement.close();
            conexion.commit();
            conexion.close();
            System.out.println(insert);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
