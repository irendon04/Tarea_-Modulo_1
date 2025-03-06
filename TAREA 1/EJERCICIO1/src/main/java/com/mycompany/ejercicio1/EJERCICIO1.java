/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author rendo
 */
public class EJERCICIO1 {

    public static void main(String[] args) {
        System.out.println("Hola, soy Ingrid Rendon");
        
        //Ejercicio2 operaciones aritméticas de dos números enteros
        int primerNumero= 10;
        int segundoNumero= 5;
        System.out.println("Suma: " + (primerNumero + segundoNumero));
        System.out.println("Resta: " + (primerNumero - segundoNumero));
        System.out.println("Multiplicacion: " + (primerNumero * segundoNumero));
        System.out.println("Division: " + (primerNumero / segundoNumero));
        System.out.println("Modulo: " + (primerNumero % segundoNumero));
        
        //Ejercicio3 Evaluacion de expresiones
        int valorM = 6, valorT = 1, valorK = -10;
        System.out.println("¿M es mayor que T?: " + (valorM > valorT));
        System.out.println("¿T dividido por K es igual a -5?: " + (valorT / valorK == -5));
        System.out.println("¿(M+T es igual a 7) o (M-T es igual a 5)?: " + ((valorM + valorT == 7) || (valorM - valorT == 5)));
        
        //Ejercicio4 Arreglo de nombres de compañeros
        String[] listaNombres = {
            "Arnold Eligio Aguilar Contreras", "Allison Michell Pineda Herrera", "Kevin Felipe Altamirano Montoya",
            "Amir Eduardo Borjas Juanez", "Andrea Giselle Osejo Canales", "Bianka Nicolle Rivera Gallo",
            "Brayan Said Perdomo Franco", "Lisbeth Onelia Cerrato Zepeda", "Cinthia Yaritza Vazquez",
            "Claudia Lizeth Hernandez Lazo"
        };
        System.out.println("\nLista de nombres de companeros:");
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
        
        //Ejercicio5 Arreglo multidimensional con datos personales de compañeros
        String[][] datosCompaneros = {
            {"Emerson", "Santos", "Ingenieria Computacional", "N/A"},
            {"Edwin", "Rodriguez", "Ingenieria Electrica", "N/A"},
            {"Jose Eduardo", "Rodriguez Vasquez", "Ingenieria Industrial", "N/A"},
            {"Josue Manuel", "Henriquez Cruz", "Ingenieria Industrial", "N/A"},
            {"Arnold Eligio", "Aguilar Contreras", "Ingenieria Computacional", "N/A"}
        };
        
        System.out.println("\nDatos personales de companeros:");
        for (String[] companero : datosCompaneros) {
            System.out.println("Nombre: " + companero[0] + ", Apellido: " + companero[1] + ", Carrera: " + companero[2] + ", Lugar de Trabajo: " + companero[3]);
        }
    }
}
