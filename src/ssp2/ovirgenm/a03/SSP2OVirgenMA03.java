/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp2.ovirgenm.a03;
import java.util.Scanner;

/**
 *
 * @author Orianna
 */
public class SSP2OVirgenMA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int opEntrada;
     Scanner teclado = new Scanner(System.in);
     double angulo;
     double tangente;
     double seno;
     double coseno;
    
     System.out.println("Bienvenido al menu trigonometrico");
     System.out.println("Tecle la opción que desea");
     System.out.println("1. Calcular seno");
     System.out.println("2. Calcular coseno");
     System.out.println("3. Calcular tangente");
     System.out.println("4. Salir");
     opEntrada = teclado.nextInt();
    
     switch (opEntrada){
         case 1:
            System.out.println("Bienvenido a la opción de senos");
            angulo=pedirAngulo();
            angulo=Math.toRadians(angulo);
            seno= Math.sin(angulo);
            System.out.println("El seno del angulo es "+seno);
            break;
         case 2:
            System.out.println("Bienvenido a la opción de cosenos");
            angulo=pedirAngulo();
            angulo=Math.toRadians(angulo);
            coseno=Math.cos(angulo);
            System.out.println("El coseno del angulo es "+coseno);
            break;
         case 3:
            System.out.println("Bienvenido a la opción de tangentes");
            angulo=pedirAngulo();
            angulo=Math.toRadians(angulo);
            tangente=Math.tan(angulo);
            System.out.println("La tangente del angulo es "+tangente);
            break;
         default:
            System.out.println("Gracias por consultar nuestro menu!");
    }
    
    }
    
           static double pedirAngulo(){
           double angulo;
           Scanner teclado = new Scanner(System.in);
           System.out.println("Introduzca el angulo que desea calcular");
           angulo=teclado.nextDouble();
           return angulo;
       } 
}

