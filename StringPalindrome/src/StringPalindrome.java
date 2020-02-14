import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String txtInput = input.nextLine();
		if (isPalindrome(txtInput)) {
			System.out.println("The text is a palindrome.");
		} else {
			System.out.println("No palindrome");
		}
		input.close();
	}

	private static boolean isPalindrome(String input) {
		String dummy = input.trim();
		dummy = dummy.toLowerCase();
		// delete whitespace, commas,
		// dots, colons, semi-colons, question marks,
		// exclamation marks, hyphens,
		// single quotes and double quotes
		dummy = dummy.replaceAll("( ){1,}", "");
		dummy = dummy.replaceAll("[\\.,:;?!\\-'\"]", "");
		if (dummy.matches("(.*)[0-9](.*){1,}"))
			return false;
		if (dummy.length() == 0) {
			return false;
		}
		char[] originalString = dummy.toCharArray();
		char[] backwardString = new char[originalString.length];
		int j = 0;
		for (int i = originalString.length - 1; i >= 0; i--) {
			backwardString[j] = originalString[i];
			j++;
		}
		dummy = new String(originalString);
		String compareDummy = new String(backwardString);
		if (dummy.equals(compareDummy)) {
			return true;
		}

		return false;
	}
}