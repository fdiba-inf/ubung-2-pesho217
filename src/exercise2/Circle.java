package exercise2;

import java.util.Scanner;

public class Circle {
  public static void main(String []args) {
    Scanner input = new Scanner(System.in);

    double Pi = Math.PI;
    double r = input.nextDouble();
    double C = 2*Pi*r;
    double A = Pi*r*r;

    System.out.println(C);
    System.out.println(A);
  }
}

  
