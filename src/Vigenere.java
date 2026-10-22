import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Hello user! You may now read in a message of your choice.");
		// Read in message
		String message = in.nextLine();
		// Read in shift
		int shift = in.nextLine().toUpperCase().charAt(0) - 'A';
		String output = "";
		// Loop through message
		// if letter is alphabetic
		// apply shift
		// if letter is past 'Z'
		// subtract 26
		// add letter to output
		// make sure to also loop through the key later on
		for (int x = 0; x < message.length(); x++) {
			char letter = message.charAt(x);
			if (Character.isAlphabetic(letter)) {
				letter += (int) (shift);
				if (letter > 'z') {
					letter -= 26;
				}

			}
			output += letter;

		}
		// print output
		System.out.println(output);
	}
}