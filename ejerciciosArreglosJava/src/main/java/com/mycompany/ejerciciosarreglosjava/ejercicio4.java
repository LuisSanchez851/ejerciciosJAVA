/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosarreglosjava;

/**
 *
 * @author ASUS
 */
public class ejercicio4 {
    public static void main(String[] args) {
    
        char myArray[][]= new char
                [4][4];
        for(int i=0; i<4;i++)
        {
            for(int j=0; j<4;j++)
            {
                myArray[i][j]='0';
            }
            myArray[0][0]='\\';
            myArray[1][1]='\\';
            myArray[2][2]='\\';
            myArray[3][3]='\\';
            myArray[3][0]='/';
            myArray[2][1]='/';
            myArray[1][2]='/';
            myArray[0][3]='/';
        }
        for(int i=0;i<4;i++ )
        {
            for(int j=0; j<4;j++)
            {
                System.out.print(myArray[i][j]);
            }
            System.out.println("");
        }
    }
}
