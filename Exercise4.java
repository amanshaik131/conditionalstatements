/* Write a program to print the following equilateral traingle pattern:
   *
  ***
 *****
*******

*/
import java.util.Scanner;
class Exercise4
  {

	public static void main(String args[])
  {
    System.out.println("enter the number of rows and columns");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
      {
        for(int space=1;space<=n-i;space++)
          {
            System.out.print(" ");
          }
        for(int j=1;j<=(2*i)-1;j++)
          {
            System.out.print("*");
          }
        System.out.println();
      }

  }
}