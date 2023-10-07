/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {
public static void main(String args[])
  {
int a,b;
  System.out.println("enter the three values ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
System.out.println("the difference of two numbers"+(a-b));
System.out.println("the product of two numbers "+(a*b));
System.out.println("the division of two numbers "+(a/b));
System.out.println("the increment of a number "+(a++));
System.out.println("the decrement of a number"+(b--));
System.out.println("the remainder of two numbers "+(a%b));
}
}