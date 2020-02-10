package mieibeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Add implements java.io.Serializable{
    private String parola;
    private String significato;
    private String result;
    //String connectionString="jdbc:mysql://localhost:3306/dbparola?user=root&password=";

public String getAdd(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/eoC2i6ecss?user=eoC2i6ecss&password=e82eOPGCxU");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select parola FROM dbparola WHERE parola='"+parola+"'");
        while(rs.next()){
            result=rs.getString("parola");
        }
        if(result!=null){
            return "termine già presente all'interno del database!";
        }
        else{
            stmt.executeUpdate("INSERT into dbparola(parola,significato) VALUES('"+parola+"','"+significato+"')");
        }
        return "Parola inserita";
    }catch(Exception e){
        return e.toString();
    }
}


    public void setParola(String p){
        parola = p;
    }

    public void setSignificato(String p){
        significato = p;
    }

    public void setContrario(String p){
        contrario = p;
    }
}