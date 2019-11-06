//uncomment next line if program requires input
import java.util.Scanner;

public class OddEven{
        public static void main(String[] args){
            //uncomment next line if program requires input
            //Scanner input = new Scanner(System.in);

            Scanner input = new Scanner(System.in);
            int number = 0;

            System.out.print("Enter a number: ");
            number = input.nextInt();
            System.out.println();

            if(number%2 == 0){
            System.out.println("number is even");
            }

            if(number%2 != 0) {
                System.out.println("number is odd");
            }









        }
}