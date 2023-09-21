/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosarreglosjava;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numeroNotas=0;
        double acumulador=0;
        double promedio=0;
        int notas=0;
        
        System.out.println("Ingrese el numero de notas: ");
        numeroNotas = leer.nextInt();
        
        float myMatriz[] = new float[numeroNotas]; 
        
        for(int i=0; i<numeroNotas; i++){
            System.out.println("Digite el valor de su nota: ");
            notas=leer.nextInt();
            myMatriz[i]=notas;
            acumulador =acumulador+myMatriz[i];
        }
        System.out.println("Los datos que ingresados son: ");
        for(int i=0; i<numeroNotas;i++){
            System.out.println(""+myMatriz[i]);
        }
        promedio=acumulador/numeroNotas;
        System.out.println("El promedio de tus notas es: "+promedio);
    }
}

