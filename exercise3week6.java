import java.util.Scanner;
public class exercise3week6{
        public static void main(String[] args){
            //uncomment next line if program requires input

            Scanner input = new Scanner(System.in);

            String time = "";
            int day = 0;
            int month = 0;
            int year = 0;
            String fName = "";

            System.out.println("Enter Time <hi:mi>: ");
             time = input.next();

            System.out.println("enter day:   ");
            day = input.nextInt();

            System.out.println("Enter month: ");
            month = input.nextInt();

            System.out.println("Enter year:  ");
            year = input.nextInt();

            System.out.println("Enter first Fname: ");
            fName = input.next();

            System.out.println();
            System.out.println("Hello " + fName );
            System.out.println("It is " + time + " on " + day + "/" + month + "/" + year );



;










        }
}