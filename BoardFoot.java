import java.util.Scanner;
/**.
 * Class boardFoot
 * User inputs first 2 dimensions code will caculate equal to 1 board foot
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-02-28 
 */

public class BoardFoot {

  // Variables
  static double userLength;
  static double length;
  static double userWidth;
  static double width;
  static double userHeight;
  static double height;
  static double remain;

  /**.
   * This program calculates 2 paramenters and finds the missing parameter
   */

  public static void main(String[] args) {

    // Prints introduction to program
    System.out.println("This will calculate your input to equal 1 boardFoot");

    // Print enter 0 to skip a measurement     
    System.out.println("To skip a parameter, enter: 0");

    // Prints Enter length in inches
    System.out.println("Enter length in inches: ");

    // User inputs length of board
    Scanner input = new Scanner(System.in);
    userLength = input.nextDouble();

    if (userLength >= 1) {
      length = userLength;
    }

    // If user decides to skip
    if (userLength == 0) {
      length = 1.0;
    }

    if (length < 1) {
      System.out.println("Invalid Input");
      System.exit(0);
    }
    // Prints Enter width in inches
    System.out.println("Enter width in inches: ");
    // User inputs width of board
    userWidth = input.nextDouble();

    if (userWidth >= 1) {
      width = userWidth;
    }
    // If user decides to skip
    if (userWidth == 0) {
      width = 1.0;
    }
    // If user decides to skip twice
    if ((userWidth == 0) && (userLength == 0)) {
      System.out.println("You must enter 2 out of the 3 measurements");
      System.exit(0);

    }
    if (width < 1) {
      System.out.println("Invalid Input");
      System.exit(0);
    }

    // Prints Enter height in inches
    System.out.println("Enter height in inches: ");

    // User inputs height of board
    userHeight = input.nextDouble();

    if (userHeight >= 1) {
      height = userHeight;
    }

    // If user decides to skip
    if (userHeight == 0) {
      height = 1.0;
    }

    // If user decides to skip twice
    if ((userHeight == 0) && (userLength == 0)) {
      System.out.println("You must enter 2 out of the 3 measurements");
      System.exit(0);

    }
    // If user decides to skip twice    
    if ((userHeight == 0) && (userWidth == 0)) {
      System.out.println("You must enter 2 out of the 3 measurements");
      System.exit(0);

    }
    // If user inputs 3 measurements
    if ((userHeight >= 1) && (userWidth >= 1) && (userLength >= 1)) {
      System.out.println("You must enter 2 out of the 3 measurements");
      System.exit(0);

    }

    if (height < 1) {
      System.out.println("Invalid Input");
      System.exit(0);
    }

    // Calculates remaining measurement     
    if ((userLength >= 1) && (userWidth >= 1)) {
      remain = 144 / (userWidth * userLength);
      System.out.println("The height is: " + remain + " inches");
      System.exit(0);
    }

    // Calculates remaining measurement    
    if ((userLength >= 1) && (userHeight >= 1)) {
      remain = (144 / (userHeight) / userLength);
      System.out.println("The width is " + remain + " inches");
      System.exit(0);
    }

    // Calculates remaining measurement    
    if ((userHeight >= 1) && (userWidth >= 1)) {
      remain = (144 / (userHeight) / userWidth);
      System.out.println("The length is " + remain + " inches");
      System.exit(0);
    }
  }
}