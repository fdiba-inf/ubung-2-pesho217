package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {
  public static void main(String []args) {
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    System.out.println("Number is");
    int number1 = number%2;
    if (number1 == 0) {
<<<<<<< HEAD
      System.out.print("even");
    } else {
      System.out.print("odd");
=======
      System.out.print("odd");
    } else {
      System.out.print("even");
>>>>>>> 77aeb9c683c34bc3f7100ab9c7ddd96f050ddd4f
    }
    
  }
}
  
