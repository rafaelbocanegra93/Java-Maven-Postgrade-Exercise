package org.example;

import org.example.Empleados;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Empleados.cleanTable();
        Empleados.createUser(12258,"Simón",3,6000000);
        Empleados.createUser(13545,"Tomás",5,5400000);
        Empleados.createUser(45687,"Bartolomé",9,7200000);
        Empleados.createUser(21546,"Juan",24,4300000);
        Empleados.createUser(46875,"Andrés",65,3500000);
        Empleados.createUser(654543,"Pedro",54,3800000);
        Empleados.createUser(56156,"Santiago",12,6600000);
        Empleados.createUser(99865,"Felipe",13,1800000);
        Empleados.createUser(33461,"Mateo",1,3514132);
        Empleados.createUser(788756,"Judas",4,2355000);
        Empleados.filterBySalaryAndMounts(">",5000000,"<",6);


    }
}