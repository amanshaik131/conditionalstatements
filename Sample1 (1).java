//Complete and execute Java program to check whether a number is prime or not.

class Sample1 {
public static void main(String args[]) {
// Variable Declarartion & Initialization n=97 and a Temporary variable c=0
int n=3,c=0;

// Run a for loop till half of the number 
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			// Increment temporary variable c everytime when condition is true	
      c++;
		}
	}
	// Checking if c equals to 1 because in case of Prime number c will increment only once when done modulus by 1 
	if(c==1)
		System.out.println("Number is Prime");

	else
		System.out.println("Number is not Prime");
 }
}