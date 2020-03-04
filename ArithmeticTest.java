/*
Program Name:
Variables/Types: List variables and types here
Inputs: yes/no
If/else statements: yes/no
Loops: yes/no
Loop how many times: fixed / unknown / not applicable
*/
//uncomment next line if input required
import java.util.Scanner;
public class ArithmeticTest{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int num4 = 0;
    int num5 = 0;
    int num6 = 0;
    int num7 = 0;
    int result = 0;
    System.out.print("Enter Number 1:  ");
    num1 = input.nextInt();
    System.out.print("Enter Number 2:  ");
    num2 = input.nextInt();
    System.out.print("Enter Number 3:  ");
    num3 = input.nextInt();
    System.out.print("Enter Number 4:  ");
    num4 = input.nextInt();
    System.out.print("Enter Number 5:  ");
    num5 = input.nextInt();
    System.out.print("Enter Number 6:  ");
    num6 = input.nextInt();
    System.out.print("Enter Number 7:  ");
    num7 = input.nextInt();
    
    result = num1+num2+num3+num4+num5+num6+num7;
    System.out.println(num1+" + "+num2+" + "+num3+" + "+num4+" + "+num5+" + "+num6+" + "+num7+" = "+result);
    
    //Declare variables/types
    //Add code here for Inputs, if/else statements, loops
   }
}