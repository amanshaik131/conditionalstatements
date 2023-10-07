// Write a program to print the multiplication table of any number of your choice

import java.util.Scanner;
class Exercise3 {

	public static void main(String args[]) 
  {
   System.out.println("enter the number of a table ");
  Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    while(i<=10)
      {
        System.out.println(n+" "+"*"+" "+i+" "+"="+(n*i));
        i++;
      }
    

	}

}