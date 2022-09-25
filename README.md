# EJERCICIO-4-Hoja-2
Clase Scanner en JAVA para sacar la base de un triangulo


```java

/**
 * @author DAW120
   📌 EJERCICIO 4, Hoja 2.  
   
   🔴 Programa que declara e inicializa dos variables: altura y base de un triángulo,
      asigna a altura el valor 12.2 y a la base el valor 10, estos datos deben ser 
      pedidos por pantalla (Utiliza la clase scanner) y luego nos visualiza el área 
      correspondiente.
      
        🏴‍ El área del triángulo es:61,00 
 */ 

import java.util.*;
public class Ejercicio4_Hoja2 {
    public static void main(String[] args) {      
        double base;      
        double altura;    
        double resultado;
        Scanner obj=new Scanner(System.in);            
              System.out.println("Escribe la base: ");             
              base=obj.nextDouble();        
              System.out.println("Mete la altura: ");
              altura=obj.nextDouble();
        resultado=((base*altura)/2);   
        System.out.print("El area del Triangulo es: "+resultado);
    }
}

```

![EJERCICIO 4 Hoja 2](https://repository-images.githubusercontent.com/541282839/0963c75c-68ad-4dad-8e90-7af3c59f541c)




