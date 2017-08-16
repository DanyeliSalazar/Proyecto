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
public class Ciclos {
    
    public void tareasciclos(){
    
    Scanner entrada = new Scanner (System.in);
    
    int muestra;
    
    System.out.println("MENU");
    System.out.println("1: muestra los números del 1 al 100.");
    System.out.println("2: muestra la suma de los numeros impares del 1 a 100.");
    System.out.println("3: pide un numero y muestra en pantalla el mismo número de asteriscos.");
    System.out.println("4: pide un numero y muestra si es primo o no");
    
    muestra = entrada.nextInt();
        
        switch(muestra){
            case 1:                        	
                int z;    
                for(z=1;z<=100;z++){
                System.out.println(z);}
                break;
                
            case 2:
                int x,sum;
                sum=0;
                for (x=1;x<=100;x++){
                if (x%2!=0){
                sum=sum+x;}}
                {
                System.out.println(sum);}
                break;
                
            case 3:
                int num1, h;
                System.out.println("Introduzca número:");
                Scanner n1 = new Scanner(System.in);
                num1 = n1.nextInt();
        	for (h=1;h<=num1;h++){
                System.out.println("*");}
                break;   
                
            case 4:
                Scanner scanner = new Scanner (System.in);
                System.out.println("Ingrese el numero");
                int num = scanner.nextInt();           
                int num2 = num-1 ;
                while((num%num2) != 0){
                num2--;}
                if(num2 ==1 ){
                System.out.println("El numero ingresado SI es Primo");}
                else{
                System.out.println("El numero ingresado No es Primo");} 
                break;
        }
    }
}