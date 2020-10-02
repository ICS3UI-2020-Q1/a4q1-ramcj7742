import java.util.Scanner;
/**
 * Creates a program that counts down to the users * selected number by 5's
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //Gets users countdown number
    System.out.println("Please enter an integer to count down to.");
    int stop = input.nextInt();

    //countdown start variable
    int START = 100;

    //countdown loop
    System.out.println("Count down:");
    while(stop <= START){
      System.out.println(START);
      START = START - 5;
    }
    
  }
}
