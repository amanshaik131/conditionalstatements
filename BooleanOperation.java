/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     Sample Input:
     Enter x as boolean value(true/false): 
     true
     Enter y as boolean value(true/false): 
     false
     
     Expected Output:
     x&&y is: false
     x||y is: true
     !x is: false
     !y is: true

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class BooleanOperation 
{
  public static void main(String args[])
  {
    System.out.println("Enter x as boolean value(true/false):");
    Scanner sc=new Scanner(System.in);
    boolean x=sc.nextBoolean();
    System.out.println("Enter y as boolean value(true/false):");
    Scanner sc1=new Scanner(System.in);
    boolean y=sc1.nextBoolean();
    System.out.println(x&y);
    System.out.println(x||y);
    System.out.println(!x);
    System.out.println(!y);
  }


}