import java.util.Scanner;
public class Implementation {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] Words = {"whale", "happy", "child"};
		char[] Whale = {'w','h','a','l','e'};
		char[] Happy = {'h','a','p','p','y'};
		char[] Child = {'c','h','i','l','d'};
		
		//randomizer

		String correctword = "whale";
		char[] CWord;
		if(correctword=="whale"){
			CWord = Whale.clone();
		} else{
			CWord = null;
		}
		
		//for(char x: cca) System.out.println(x);
		
		//user input
		System.out.print("Enter a word: ");
		char[] Guess = input.next().toCharArray();

		//for(char x: UI) System.out.println(x);

		//comparing strings
		boolean tf = true;
		for(int i=0; i<CWord.length; i++) {
			if(CWord[i]!=Guess[i]) {
				tf = false;
			}
		}
		System.out.println(tf);

		for(int i = 0; i < Guess.length; i++){
			
			for (int j = 0; j < CWord.length; i++){

				if (Guess[i] == CWord[j] && i == j){

					System.out.println("green");// correct spot and letter
				} 
				else if (Guess[i] == CWord[j])
				{
					System.out.println("Yellow");// Correct letter
				}
			}
		}
	
	
	}
		
}

