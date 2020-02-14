import java.util.Scanner;

public class StringDecimalPartLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String numInput;
		int numOfDecimalPoint = 0;
		System.out.print("Enter a decimal number: ");
		numInput = input.nextLine();
		numInput = numInput.replace(",", ".");
		if (checkDecimalNumberValidity(numInput)) {
			numOfDecimalPoint = numOfDecimalDigit(numInput);
			System.out.println(numOfDecimalPoint + " decimal place(s)");
		} else
			System.out.println("Please enter a proper decimal number");
		input.close();
	}

	private static boolean checkDecimalNumberValidity(String text) {
		if (text.substring(0, 1).matches("[^0-9]"))
			return false;
		if (text.indexOf(".") != text.lastIndexOf("."))
			return false;
		if (text.indexOf(".") <= 0 || text.indexOf(".") == text.length() - 1)
			return false;
		if (text.matches("[^0-9.]"))
			return false;

		return true;
	}

	private static int numOfDecimalDigit(String text) {
		// System.out.println("Text.indexOf(.) = " + text.indexOf("."));
		// System.out.println("substring length = " +
		// text.substring(text.indexOf("."), text.length()).length());
		return text.substring(text.indexOf(".") + 1, text.length()).length();
	}
}
