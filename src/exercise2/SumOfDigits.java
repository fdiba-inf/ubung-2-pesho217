package exercise2;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String []args){
    Scanner input = new Scanner(System.in);
    
    int number = input.nextInt();
    int number1 = number/100;
    int number2 = number/10 - number1*10;
    int number3 = number/10;
    int number4 = number - number3*10;
    int result = number1 + number2 + number4;
    System.out.println(result);
  }
}

