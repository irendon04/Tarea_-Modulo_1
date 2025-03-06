/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author rendo
 */

// Clase Recursos basada en Instancias y Objetos
public class Recursos {
    
    // Método 1: Retorna un mensaje
    public String obtenerMensaje() {
        return "Programación Orientada a Objetos 2021";
    }
    
    // Método 2: Retorna si es mayor o menor de edad
    public String verificarEdad(int edad) {
        return (edad >= 21) ? "Mayor de edad" : "Menor de edad";
    }
    
    // Método 3: Retorna la multiplicación de dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    // Método 4: Retorna una lista de números del 1 a X
    public int[] generarLista(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}

// Clase principal basada en Instancias y Objetos
public class Principal {
    public static void main(String[] args) {
        Recursos recursos = new Recursos();
        
        // Llamando al método obtenerMensaje
        System.out.println(recursos.obtenerMensaje());
        
        // Llamando al método verificarEdad
        int edad = 22;
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));
        
        // Llamando al método multiplicar
        int resultado = recursos.multiplicar(7, 4);
        System.out.println("Multiplicación: 7 * 4 = " + resultado);
        
        // Llamando al método generarLista
        int x = 6;
        int[] lista = recursos.generarLista(x);
        System.out.print("Lista de números del 1 al " + x + ": ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}
