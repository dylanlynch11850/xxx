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
public class AddWhatTest{
  public static void main(String[] args){
    //uncomment next line if input required
    Scanner input = new Scanner(System.in);
    int num1 = 0;
    //int result = 0;
    System.out.print("Enter Number 1:  ");
    num1 = input.nextInt();

    if(num1 > 10 && num1 < 100){
        num1 = num1 + 1;
    }else if(num1 > 120 && num1 < 200){
        num1 = num1 + 2;
    }else if(num1 > 220 && num1 < 300){
        num1 = num1 + 7;
    }else {
        num1 = num1 + 3;
    } 

    // num1 is greater than 220 and less than 300 - add 7 to the number
    System.out.println("Updated number is "+num1);

    //Declare variables/types
    //Add code here for Inputs, if/else statements, loops
   }
}