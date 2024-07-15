public class KataKata{

	public static int factorial (int userInput){
	int result = 1;

		for (int counter = 1; counter <= userInput; counter++){
			result *= counter;
		}
		if ( userInput == 0){
			return 1;
		}
		else{
			return result;
		}

	}

	
	
}