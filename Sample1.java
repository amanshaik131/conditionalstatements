// Complete and execute java Program for Narrow/Explicit Type-casting

class Sample1 {
	public static void main(String args[])
	{
		// Initialize a variable to store your marks of Computer Science subject- out of 50
		   int marks=40;
		// Calculate the percentage of marks and store it in a float variable
		float percent=(float)marks/50*100;
		// Cast the percentage to int(whole number, decimal points removed)
		
		// Print the casted percentage
		System.out.println("Percentage of marks in CS = "+(int)percent +"%");
	}

}
