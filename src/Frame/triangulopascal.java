/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;
import java.util.Scanner;
/**
 *
 * @author erick
 */
public class triangulopascal {
 public static void main (String [] args) {
     Scanner captura = new Scanner (System.in);
     int L;
      System.out.println("Cuantas filas quieres ver:");
      L = captura.nextInt();
      for (int i = 0; i < L; i++) {
          for (int j = L; j > i; j--) {
              System.out.print(" ");
              
          }
          int V = 1;
          for (int k = 0; k <=i; k++) {
              System.out.print(V +" ");
              V = V *(i -k)/(k +1);
              
              
          }
          System.out.println(" ");
      }
          
                 
     
 }
}