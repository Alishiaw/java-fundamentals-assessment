import java.util.Scanner;

public class Assessment {

        public static void main(String [] args)
        {

            Scanner in = new Scanner(System.in);

            double firstNumber, secondNumber;
            double sum;

            System.out.print("Please enter first number: ");
            firstNumber = in.nextInt();

            System.out.println("Enter your second number: ");
            secondNumber = in.nextInt();

            sum = firstNumber + secondNumber;
            System.out.println("Sum of the two numbers are: " + sum);

        }

    }



