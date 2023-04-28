
package com.mycompany.tpfdesarrolladorjava;

import java.sql.*;


public class Equipo {
    private String nombre;
    private int titulares;
    private int suplentes;
    private String directorTecnico;
    private int puntos;
    private int partidosJugados;
    
    public Equipo(){};
    
    public Equipo (String nombre, int titulares, int suplentes, String directorTecnico, int puntos, int partidosJugados ){
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.puntos = puntos;
        this.partidosJugados = partidosJugados;
    };
    
    public String ConsultarTodosLosEquipos()  {
        ResultSet rs = null;
        String resultado = null;
        try{
        
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/equipo","root","");
            Statement stmt=con.createStatement();
            
            rs = stmt.executeQuery ("SELECT * FROM Equipo");
            while(rs.next()){
                resultado += (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt (3) + " " +
                        rs.getInt (4) + " " + rs.getString(5) + " " + rs.getInt(6) + " " +
                        rs.getInt(7) + " | "); 
            
            }
             con.close();
             
            
        } catch(Exception e){ System.out.println(e);} 
        
        
        return resultado;
    }
    
    public String ConsultarUnEquipo(int idEquipo)  {
    ResultSet rs = null;
    String resultado = null;
    String consulta = "SELECT * FROM Equipo WHERE idEquipo = ?";
    try{
        
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/equipo","root","");
        Statement stmt=con.createStatement();
            
        PreparedStatement ps = con.prepareStatement(consulta);
        ps.setInt(1, idEquipo);
        rs = ps.executeQuery();
        while(rs.next())
        resultado = (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt (3) + " " +
                        rs.getInt (4) + " " + rs.getString(5) + " " + rs.getInt(6) + " " +
                        rs.getInt(7) + " "); 
            
    con.close();
             
            
    } catch(Exception e){ System.out.println(e);} 
        
        
    return resultado;
    }
}
