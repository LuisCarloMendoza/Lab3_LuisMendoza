/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_luismendoza;

import java.util.Scanner;

public class Lab3P1_LuisMendoza {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double z =1;
        
        
        do{
            System.out.println("********************************************");
            System.out.println("Bienvenido al programa de la primera Tarea!");
            System.out.println("Elija una opción: ");
            System.out.println("1. Ejercicio #1, 2. Ejercicio #2, 3. Ejercicio #3, 4. Salir");
            
            int opcionUsuario = entrada.nextInt();
            double dividend = 0;
            double divisor = 0;
            double factorial = 0;
            double m = 1;
            double n = 1;
            double fullFraction1 = 0;
            double fullFraction2= 0;
            double multiple = 0;
            double l = 3;

            if (opcionUsuario == 1) {
                
               System.out.println("Ingrese un codigo formato letra-numero-letra...");
               System.out.println("");
               String s = entrada.nextLine();
               s += entrada.nextLine();
               
               String r = "";
               

                int sLong = s.length();

                for (int z1 = 0; z1 < sLong; z1 += 2) {
                    
                    char t1 = s.charAt(z1 + 1);

                    char t2 = s.charAt(z1);

                    s = s.replace(t1, t2);

                }
                System.out.println(s);
                
                
                

                
            } else if (opcionUsuario == 2) {

                System.out.println("Ingrese el valor de k: ");
                double k = entrada.nextDouble();
                
                for (n = 1; n <= k; n+=1){
                    
                     dividend = (2*n) + 1;
                     
                     divisor = (n*n) + 3; 
                     
                     factorial = divisor * (divisor - n);
                     
                     while (n + 2 <= divisor){
                         m++;
                         factorial = factorial * (divisor - m);
                         
                     } System.out.println(factorial);
                      
                    
                }
                fullFraction1 += (dividend) / (factorial);
                 
                        
               
                
                       

                
                
                
                
                
                
                
                
                

            } else if (opcionUsuario == 3) {

                
                System.out.println("Ingrese el numero de filas!");
                int filas = entrada.nextInt();
                
                       
                   for (int altura = filas; altura >= 0; altura--) {

                       for (int espacio = 1; espacio <= filas - altura; espacio++) {
                           System.out.print(" ");
                       }

                       for (int ast = 1; ast <= altura * 2 - 1; ast++) {
                           System.out.print("*");
                       }

                       System.out.println("");
                   }
                   
                   for (int altura = 1; altura <= 1; altura = altura *2) {

                       for (int espacio = 1; espacio <= filas - altura; espacio++) {
                           System.out.print(" ");
                       }

                       for (int ast = 1; ast <= altura * 2 - 1; ast++) {
                           System.out.print("*");
                       }

                       System.out.println("");
                   }
                
                
                
                
                
                

                

            } else if (opcionUsuario == 4) {
                 break;
            } else {
                System.out.println("Opción no valida");
            }
        } while (true);
        
        
    }
    
}
