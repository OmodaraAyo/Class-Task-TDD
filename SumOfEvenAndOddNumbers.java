import java.util.Scanner;
public class SumOfEvenAndOddNumbers{
	public static void main (String...args){
	Scanner input = new Scanner(System.in);

	int sumOfEvenNumbers = 0;
	int sumOfOddNumbers = 0;
	for(int counter = 1; counter <= 10; counter++){
	
		System.out.print("Enter a number: ");
		int userInput = input.nextInt();

		if (userInput % 2 == 0){
			sumOfEvenNumbers += userInput;
		}
		else
			if (userInput % 2 == 1){
				sumOfOddNumbers	+= userInput;
			}

	}
	System.out.printf("\nSum of even numbers = %d", sumOfEvenNumbers);
	System.out.printf("\nSum of odd numbers = %d", sumOfOddNumbers );
}
}