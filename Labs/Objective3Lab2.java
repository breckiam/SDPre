public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1 = 10.0, side2 = 8.0, hypotenuse;

    //Prints side1 and side2 before they are squared
    System.out.print("The hypotenuse of a triangle with the sides " + side1);
    System.out.print(" and " + side2);

    //Squares side1 and side3 and caculates the hypotenuse
    side1 = side1 * side1;
    side2 = side2 * side2;
    hypotenuse = Math.sqrt(side1 + side2);

    //adds the hypotenuse calc to the print statment
    System.out.println(" is " + hypotenuse);

  }
}
