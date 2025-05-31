import java.util.Random;
import java.util.Scanner;
public class ass2 {


	public static void main(String[] args) {
		String[] words = { "antelope", "ape", "badger", "bear", "beaver", "bison", "crocodile", "elephant", "elk",
				"ferret", "goat", "goose", "kangaroo", "llama", "lion", "monkey", "moose", "orangutan", "shark",
				"snake", "tiger", "whale", "wombat" };

		Random ra = new Random();
		Scanner sc = new Scanner(System.in);
		String check = words[ra.nextInt(words.length)];

		System.out.println(check);// only for testing to

		String input;// want to use that for user input

		int times = check.length() + 3;// to guess the answer in the number of time

		String[] stwwords = new String[times];// to store wrong words for storing wrong words
		int indexw = 0; // to use as the store wrong words array of array index

			StringBuilder correctcheck = new StringBuilder();

			StringBuilder correct = new StringBuilder();
			
			StringBuilder wrong = new StringBuilder();

		System.out.println("guss the secret words");
		System.out.println(" You have " + times + " times to guss");

		for (int i = 1; i <= times; i++) {

			boolean cin;// for checking input that input is valid or not
			do {
				cin = true;
				System.out.println("\t " + i + " attemp");
				System.out.println("The number of words is " + (times - 3) + " and stat with " + check.charAt(0));
				System.out.print("Input : ");
				input = sc.nextLine().toLowerCase();

				if (input.length() != check.length()) {
					// to safe from user error
					System.out.println(
							"Your characters do not match with the correct number of words (" + (times - 3) + ")");
					cin = false;
				}

				if (i > 1) {
					// to safe that user should not input that wrong words again
					for (int j = 0; j < indexw; j++) {
						if (input.equals(stwwords[j])) {
							cin = false;
							System.out.println("Your word is already inputted ");
							System.out.println("Try again");
						}

					}

				}

			} while (!cin);// if cin is false then try again

			stwwords[indexw] = input;// to store the input even if input is true
			indexw++;// if next time came to store next array index

			
			

			if (input.equals(check)) {
				System.out.println("Correct Store : " + input);
				System.out.println("Wrong Store : "+wrong);
				break;
			}else{
				for (int j = 0; j < check.length(); j++) {
					if(correctcheck.indexOf(String.valueOf(check.charAt(j)))==-1){
						correctcheck.append(check.charAt(j));
						
					}
				}
				
				for (int j = 0; j < input.length(); j++){
					if(check.charAt(j) == input.charAt(j) && correct.indexOf(String.valueOf(input.charAt(j)))==-1 ){
						correct.append(input.charAt(j)); 
				
					}else{
						if(wrong.indexOf(String.valueOf(input.charAt(j)))==-1 && correctcheck.indexOf(String.valueOf(input.charAt(j)))==-1){
							wrong.append(input.charAt(j));
							
						}
					} 
				}

				System.out.print("Correct Stroe : "+correct );
				System.out.println();
				
				System.out.print("Wrong Store : "+wrong);
				System.out.println();
				
			} 

			
		} // to guess the answer base on the number of times

	}
	
	
}
