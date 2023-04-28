
package com.mycompany.tpfdesarrolladorjava;

public class TPFDesarrolladorJava {
        
        public static void main(String args[]) {
        
        //Instancio la clase Equipo
        Equipo equipo = new Equipo();
        
        //Consulto un solo equipo de la tabla Equipo, mediante el numero que identifica su idEquipo. 
        //En este ejemplo el equipo con idEquipo = 4 es Boca Juniors.
        int idEquipo = 4;
        String unEquipo = equipo.ConsultarUnEquipo(idEquipo);
        System.out.println(unEquipo);
        
        //Consulto todos los equipos de la tabla Equipo
        String todosLosEquipos = equipo.ConsultarTodosLosEquipos();
        System.out.println (todosLosEquipos);
        
        }    
        
}