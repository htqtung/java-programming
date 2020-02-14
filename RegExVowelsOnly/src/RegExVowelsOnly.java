import java.util.Scanner;

public class RegExVowelsOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = input.nextLine();
		text = text.toUpperCase();
		if (text.matches("[aeiouyåäöAEIOUYÅÄÖ]+")) {
			System.out.println("Vowels only");
		} else
			System.out.println("Not only vowels!");
		input.close();
	}

}