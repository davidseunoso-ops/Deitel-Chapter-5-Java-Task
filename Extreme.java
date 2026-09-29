import java.util.Scanner;
public class Extreme {
  public static void main(String... args) {
    Scanner input = new Scanner(System.in);
    
        System.out.print("How many integers would you like to enter?: ");
        int integers = input.nextInt();

        if (integers <= 0) {
            System.out.println("Enter a number greater than 0: ");
            return;
        }
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        
        for (int count = 1; count <= integers; count++) {
            System.out.print("Enter integer " + count + ": ");
            int numberOne = input.nextInt();

            if (numberOne < minimum) {
                minimum = numberOne;
                }
                if (numberOne > maximum) {
                    maximum = numberOne;
            }
        }
         int extremeSum = minimum + maximum;
         
        System.out.println("Minimum integer: " + minimum);
        System.out.println("Maximum integer: " + maximum);
        System.out.println("Sum of the two extremes is: " + minimum + " + " + maximum + " = " + extremeSum);
              }
        }
       
