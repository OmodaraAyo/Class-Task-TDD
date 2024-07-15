import java.util.Scanner;
public class ReverseUserNumber {

	public static void main (String... args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter five digit integers: ");
	int userInput = input.nextInt();

	int result = KataKata.reverseNumbers(userInput);
	System.out.printf("%d", result);

}
}