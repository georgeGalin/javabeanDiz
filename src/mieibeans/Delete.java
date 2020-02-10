package mieibeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.String;
import java.lang.Thread.State;
import java.io.*;
import java.util.*;

public class Delete implements java.io.Serializable{
    private String parola;
    private String result;


public String getDelete(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/eoC2i6ecss?user=eoC2i6ecss&password=e82eOPGCxU");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("DELETE FROM dbparola WHERE parola='"+parola+"'");
        result = "parola";
        if(result != null){
        return "Parola eliminata";
        }
        else{
            return "parola eliminata";
        }
    }catch(Exception e){
        return e.toString();
    }
}
    public void setParola(String p){
        parola = p;
    }
}
