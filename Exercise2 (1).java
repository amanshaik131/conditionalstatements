/* Write a program to print the following right angle traingle pattern:
1
22
333
4444
55555
*/
import java.util.Scanner;
class Exercise2
  {

	public static void main(String args[]) 
    {
    System.out.println("enter the number of rows and columns ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
          {
            if(j<=i)
            {
              System.out.printf("%d",i);
            }
          }
        System.out.println();
      }

	}

}