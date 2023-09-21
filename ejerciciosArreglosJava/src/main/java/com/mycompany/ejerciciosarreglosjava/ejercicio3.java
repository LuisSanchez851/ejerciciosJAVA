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
public class ejercicio3 {
    
    public static void main(String[] args) {
        
      Scanner leer = new Scanner (System.in);
      int primerNumero=0; 
      int tercerNumero=1; 
      int segundoNumero=0;
      int serieAsignada=0;
      
      
      System.out.println("Ingrese el numero de sucesiones de la serie de Fibnnacci(menores a 5): ");
      serieAsignada = leer.nextInt();
      
      int myArray[]= new int[serieAsignada];
        System.out.println("La serie de Fibonacci es: ");
        if(serieAsignada <=5){
            for(int i=0; i<serieAsignada;i++){
            myArray[i]=segundoNumero;
            
            primerNumero = segundoNumero+tercerNumero; 
            tercerNumero = segundoNumero; 
            segundoNumero = primerNumero;  
            }  
            for(int i=0; i<serieAsignada; i++){
            System.out.println(""+myArray[i]);
            }
        }else{
            System.out.println("Ingrese un numero correcto");
        
        }
    
    }    
}
