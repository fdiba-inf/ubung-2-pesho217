package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
  public static void main(String []args) {
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    System.out.println("Number is");
    int number1 = number%2;
    if (number1 == 0) {
      System.out.print("even");
    } else {
      System.out.print("odd");
    }
    
  }
}
  
