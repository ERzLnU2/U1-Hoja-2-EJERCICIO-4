/**
 * @author DAW120
   📌 EJERCICIO 4, Hoja 2.  
   
   🔴 Programa que declara e inicializa dos variables: altura y base de un triángulo,
      asigna a altura el valor 12.2 y a la base el valor 10, estos datos deben ser 
      pedidos por pantalla (Utilizar la Clase Scanner) y luego nos visualiza el área 
      correspondiente.
      
        🏴‍ El área del triángulo es:61,00 
 */ 

package com.solomongo.ejercicio4_hoja2;
import java.util.*;
public class Ejercicio4_Hoja2 {
    public static void main(String[] args) {      
       
        // declarar variables con su tipo,  de una en una...
        double base;      
        double altura;    
        double resultado;
        // double base, altura, resultado;   ...o así todas.
        
        // 🚀 ENTRADA:
        Scanner obj=new Scanner(System.in);  // la Clase (Scanner)        
      
              System.out.println("\nEscribe la base: ");             
              base=obj.nextDouble();
        
              System.out.println("Mete la altura: ");
              altura=obj.nextDouble();
        
        // 🚀 SALIDA:
        resultado=((base*altura)/2);   // la operación matematica
        System.out.print("\nEl area del Triangulo es: "+resultado+"\n\r");
    }
}



       



