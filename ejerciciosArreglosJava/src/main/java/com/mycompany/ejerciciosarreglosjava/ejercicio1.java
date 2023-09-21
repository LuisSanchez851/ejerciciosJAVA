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
public class ejercicio1 {
    public static void main(String[] args) {
        
         Scanner leer = new Scanner (System.in);
        
        //definir matriz
        System.out.println("Ingrese cantidad de filas");
        int cantFilas = leer.nextInt();
        
        System.out.println("Ingrese cantidad de columnas");
        int cantColumnas = leer.nextInt();
        
        int myMatriz[][] = new int [cantFilas][cantColumnas];
        int numImp = 1;
        
        if (cantColumnas == cantFilas){
            if (cantFilas >= 4 && cantFilas <= 12){
                if(cantColumnas >= 4 && cantColumnas <= 12){
                System.out.println("Se generara la matriz con números impares");

                    for( int i = 0; i < cantFilas; i++ ){

                        for(int j = 0; j < cantColumnas; j++ ){
                            myMatriz[i][j] = numImp + 2;
                            numImp = myMatriz[i][j];
                        }

                    }
                    
                    

                    for( int i = 0; i < cantFilas; i++ ){

                        for(int j = 0; j < cantColumnas; j++ ){
                            System.out.print(" "+myMatriz[i][j]);

                        }
                        System.out.println(" ");

                    }
                }
            }else{
                System.out.println("Ingrese números para la cantidad de filas y columnas en el rango de 4 a 12");
            }


        }else{
            System.out.println("Ingrese cantidad de filas y columnas iguales");
        }
    }
    
}
