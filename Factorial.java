import java.util.Scanner;
public class Factorial{
	public static void main (String...args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter a number: ");
	int userInput = input.nextInt();

	int result = KataKata.factorial(userInput);
	System.out.printf("factorial of %d = %d.", userInput, result);
	
  }
}