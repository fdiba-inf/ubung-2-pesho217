package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {
  public static void main(String []args) {
    Scanner input = new Scanner(System.in);

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextInt();
    double D = b*b - 4.0*a*c;
    double x1 = ((b* -1.0) + Math.sqrt(D))/2.0*a;
    double x2 = ((b* -1.0) - Math.sqrt(D))/2.0*a;
    double x = (c* -1.0)/b;
    

    if (a != 0) {
      if (D >= 0) {
        System.out.println(x1);
        System.out.println(x2);
      } else {
        System.out.println("Imaginary values");    
          } 
          } else {
            if (b != 0) {
              System.out.println(x);
            } else {
              if (c != 0) {
                System.out.println("No values");
              } else {
                System.out.println("Many values");
        }
      }
     }
   } 
 } 

    
  
