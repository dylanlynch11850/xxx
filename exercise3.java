//uncomment next line if program requires input
import java.util.Scanner;

public class exercise3{
        private static final double _0_0 = 0.0;

        public static void main(String[] args){
            //uncomment next line if program requires input
            Scanner input = new Scanner(System.in);
            double cost = _0_0;
            String topping;
            int slices;
            int day;
            int month;
            int year;





System.out.print("Enter the cost of pizza in your area: ");
cost = input.nextDouble();
System.out.print("Enter a favourite one-word topping: ");
topping = input.next();
System.out.print("Enter number of slices of pizza you would eat in one sitting: ");
slices = input.nextInt();
System.out.print("Enter a numerical value for day: ");
day = input.nextInt();
System.out.print("Enter a numerical value for month : ");
month = input.nextInt();
System.out.print("Enter a numerical value for year: ");
year = input.nextInt();

System.out.println( "why not treat yourself to dinner on "+day+"/"+month+"/"+year);
System.out.println( "have "+slices+" slices of "+topping+" pizza!");
System.out.println( "it will only cost you "+cost+"");



        }
}