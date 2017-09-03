/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap1.complejidad;

 import java.util.Scanner;

/**
 *
 * @Danyeli :)
 */
public class EjerciciosComplejidad {
    
    public  int ejemplos() {
    
    Scanner inicio = new Scanner(System.in);
    int d;
    
    System.out.println("1.Ejemplo O(1)");
    System.out.println("2.Ejemplo O(n)");
    System.out.println("3.Ejemplo O(n^2)");
    System.out.println("4.Ejemplo O(Log2 n)");
    
    d = inicio.nextInt();

switch(d){
    
    case 1:
            
                 int n = 0;                                     //O(1)
                 boolean  continuar=true;                       //O(1)
                 if (continuar){                                //O(1)
                     int i;                                     //O(1)
                     for (i=0;i<=n;i++)                         //O(1)
                         System.out.println  ("numero" + i);    //O(1)
                 }

              break;
    
    case 2:    
        
                System.out.println("Escriba un numero");
                   Scanner c = new Scanner (System.in);
                    int num = c.nextInt();                      //O(1)
                    int num2 = num-1 ;                          //O(1)
                while((num%num2) != 0){                         //O(n)
                    num2--; }
                if(num2 ==1 ){ // O(1)
                    System.out.println("Este es un numero Primo");}
                else{
                    System.out.println("Este no es un numero Primo");} 
               
                break;
              
    case 3:         
             int mult;                                         //O(1)
             
             for(int i=6;i<=10;i++){                           //O(n) 
                for(int j=6;j<=10;j++){                        //O(n)
                 mult=i*j;//O(1)            
                    System.out.println(i+"*"+j+"="+mult);    
            } 
         }
             
                 break; 
                  
       case 4:                 
                int arre[]={1,2,3,4,5,6,7,8,9,10};
                int variable = 8;
                int posini = 0;
                int posfin = arre.length-1;
                int poscen;
                
         while(posini <= posfin){
                poscen =(posfin+posini)/2;
                    if(arre[poscen] == variable){
                        System.out.println("Dato entre las posiciones "+posini+" y "+posfin);
                            
                break;
               
      }          
                    else if(variable<arre[poscen]){
                        posfin = poscen-1;
       
          }
                    else{
                        posini = poscen + 1;
             } 
                }
                
                break; 
 
    }   
}
