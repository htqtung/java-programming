import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = input.nextLine();
		int letterCounter = 0, digitCounter = 0;
		for(int i = 0; i< text.length(); i++) {
			if(Character.isDigit(text.charAt(i))) {
				digitCounter++;
			}
			else if(Character.isLetter(text.charAt(i))) {
				letterCounter++;
			}
		}
		System.out.println(letterCounter + " letter(s)");
		System.out.println(digitCounter + " digit(s)");
		input.close();

	}

}
