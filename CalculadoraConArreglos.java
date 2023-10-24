
package CalculadoraConArreglos;

import java.util.Scanner;


public class CalculadoraConArreglos {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
        System.out.println(" CALCULADORA ");
        
         double[] Numeros = {20.5,40.6,78.4,94.7,55.3,22.6,84.3};
        System.out.println(" Numeros ");
        
       
        System.out.println(" Que operacion deseas realizar ");
        System.out.println("1-- Suma");
        System.out.println("2--Multipicacion");
        
       int var = scanner.nextInt();
       
        switch (var) {
            case 1:
                double suma = 0;
                for (int i = 0; i < Numeros.length; i++) {
                   suma = suma + Numeros [i]; 
                   
                }
                System.out.println("El total de la suma es " + suma);
                break;
                
                case 2:
                 double multiplicacion = 1;
                for (int i = 0; i < Numeros.length; i++) {
                   multiplicacion = multiplicacion + Numeros [i]; 
                    }
                    System.out.println("El reusltado de la multiplicacion es:" + multiplicacion);
                break;
                
            default:
                System.out.println(" Eliga uns ocion correcta ");
         
        }
    }
    
            
}

