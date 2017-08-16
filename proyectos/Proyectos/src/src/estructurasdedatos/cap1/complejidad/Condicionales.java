/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

import java.util.Scanner;

/**
 *
 * Leidy Danyeli Salazar 1088013215
 */
public class Condicionales {
    
    public void tareascondicionales(){
    
    Scanner entrada = new Scanner (System.in);
    
    int muestra;
        
    System.out.println("MENU CONDIONALES");
    System.out.println("1: muestra suma de números impares del 1 al 100 y dice cuántos hay.");
    System.out.println("2: muestra numeros de 1 a 100 en una tabla de 10x10 ");
    System.out.println("3: pide 2 números y muestre todos los números impares que van desde el primero al segundo. Se debe controlar que los valores son correctos.");
   
        muestra = entrada.nextInt();
        
        switch(muestra){
        
        case 1:
           int a,sum,cont;
           sum=0;
           cont=0;
           for (a=1;a<=100;a++){
    	   if (a%2==0){}
           else {
           sum=sum+a;
           cont=cont+1;}}
           System.out.println("El resultado de la suma es");
           System.out.println(sum);
           System.out.println("La cantidad es");
           System.out.println(cont);
           break;
           
        case 2:
            
            int f,g,num=1;
            for (f=1;f<=10;f++){
            for (g=1;g<=10;g++){
            System.out.println(num);
            num++;}
            System.out.println("\n");}
            break;             
            
        case 3:
    
            int num1, num2,x;
            System.out.println("Introduzca primer número:");
            Scanner n1 = new Scanner(System.in);
            num1 = n1.nextInt();
            System.out.println("Introduzca primer número:");
            Scanner n2 = new Scanner(System.in);
            num2 = n2.nextInt();
            if (num1>num2){
            System.out.println("Los valores introducidos no son correctos ");
    }
             else {
	    for (x=num1;x<=num2;x++)
            if (x%2!=0)
            System.out.println(x);
            }
        }
    }
}