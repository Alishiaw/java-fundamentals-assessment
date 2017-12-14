import java.util.Scanner;

public class Assessment {

        public static void main(String [] args) {

            System.out.println("Enter length of the array?");

            Scanner in = new Scanner(System.in);
            int length = in.nextInt();
            int[] input = new int[length];

            System.out.println("Please enter numbers");
            for (int i = 0; i < length; i++) {
                input[i] = in.nextInt();
            }

            double average = average(input);

            System.out.println("Average of all number in array is " + average);
        }


           public static float average(int[] input){
               float sum = 0f;
               for(int number : input) {
                   sum = sum + number;
               }
               return sum / input.length;
            }



        }





