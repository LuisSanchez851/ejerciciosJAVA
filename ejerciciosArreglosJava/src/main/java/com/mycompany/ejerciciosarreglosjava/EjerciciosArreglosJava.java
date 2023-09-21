/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosarreglosjava;

/**
 *
 * @author ASUS
 */
public class EjerciciosArreglosJava {
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myMatriz[][]=new int[4][4]; 
        
        int acumulador=0;
        
        for(int i=0;i<4;i++){                               
            for(int j=0 ; j<4 ; j++ ){                      
                while(acumulador>=4){
                    while(acumulador<=12)
                        myMatriz[i][j]=acumulador;
                        acumulador++;  
                }
            }
        }
        for(int i=0;i<4;i++){                               
            for(int j=0 ; j<4 ; j++ ){                      
                System.out.print("|"+myMatriz[i][j]+"|");
        }
            System.out.println("");
        }
        
    }
    
}

