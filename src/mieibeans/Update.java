package mieibeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.String;
import java.io.*;
import java.util.*;

public class Update implements java.io.Serializable{
    private String parola;
    private String contrario;
    private String significato;
    private String result;

public String getUpdate(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/eoC2i6ecss?user=eoC2i6ecss&password=e82eOPGCxU");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("UPDATE dbparola SET significato ='"+significato+"' WHERE parola ='"+parola+"'");
            result = "parola";
        if(result != null){
            return "Hai modificato correttamente i tuoi dati";
        }
        else{
            return "Errore";
        }
    }catch (Exception e) {
        return e.toString();    
    }
}

public void setParola(String p){
    parola = p;
}

public void setSignificato(String p){
    significato = p;
    }
}