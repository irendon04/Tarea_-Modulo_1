/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author rendo
 */
public class EJERCICIO2 {

    public static void evaluarEstudiante(String nombre, int nota) {
        String resultado = (nota >= 70) ? "Aprobado" : "Reprobado";
        System.out.println(nombre + ", Nota= " + nota + " " + resultado);
    }

    public static void main(String[] args) {
        evaluarEstudiante("Allison", 75);
        evaluarEstudiante("Kevin", 60);
        evaluarEstudiante("Amir", 85);
        evaluarEstudiante("Andrea", 90);
        evaluarEstudiante("Arnol", 55);
        evaluarEstudiante("Brayan", 78);
    }
}
