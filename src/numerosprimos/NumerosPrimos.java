/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner obtenerNumero = new Scanner(System.in);
          System.out.println("Bienvenidos, hoy buscaremos numeros primos y multiplos de `3´");
        int contador,numero; 
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt(); 
        contador = 0;
        int i; 
        for(i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        } 
        if(contador <= 2)
        {
            System.out.println("Este numero es primo");
        }else{
            System.out.println("Este numero no es primo");
        }
        if (numero%3 == 0){
            System.out.println("Y Si es multiplo de 3");
        }else 
        {System.out.println("Y No es multiplo de 3");
        }
        System.out.println("Gracias por utilizar nuestros servicios");    
        }
    }

    
    
