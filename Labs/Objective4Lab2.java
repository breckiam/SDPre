import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    //TODO prompt the user to get input for all of the above int variables.
    System.out.print("Please enter the first");
    System.out.println(" whole number you would like to add.");
    num1 = keyboard.nextInt();

    System.out.print("Please enter the second");
    System.out.println(" whole number you would like to add.");
    num2 = keyboard.nextInt();

    System.out.print("Please enter the third");
    System.out.println(" whole number you would like to add.");
    num3 = keyboard.nextInt();
    //TODO prompt the user to get input for all of the above double variables.
    System.out.print("Please enter the first");
    System.out.println(" decimal number you would like too add.");
    dub1 = keyboard.nextDouble();

    System.out.print("Please enter the second");
    System.out.println(" decimal number you would like too add.");
    dub2 = keyboard.nextDouble();

    System.out.print("Please enter the third");
    System.out.println(" decimal number you would like too add.");
    dub3 = keyboard.nextDouble();
    //TODO print the three ints and their sum.
    int numSum = num1 + num2 + num3;
    System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + numSum);
    //TODO print the three doubles and their sum.
    double dubSum = dub1 + dub2 + dub3;
    System.out.println(dub1 + " + " + dub2 + " + " + dub3 + " = " + dubSum);

    //close Scanner
    keyboard.close();
  }
}
