import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter password: ");
		String password = input.nextLine();
		boolean result = checkStrength(password);
		if (result) {
			System.out.println("OK");
		} else
			System.out.println("Not strong enough!");
		input.close();
	}

	private static boolean checkStrength(String password) {
		boolean letter = false;
		boolean capital = false;
		boolean number = false;
		boolean remainingCharacter = false;
		int categoryCount = 0;
		if (password.length() < 8) {
			return false;
		}
		for (int i = 0; i < password.length(); i++) {
			if (capital == false && password.substring(i, i + 1).matches("[A-ZÅÄÖ]")) {
				capital = true;
				categoryCount++;
			}
			if (letter == false && password.substring(i, i + 1).matches("[a-zåäö]")) {
				letter = true;
				categoryCount++;
			}
			if (number == false && password.substring(i, i + 1).matches("[0-9]")) {
				number = true;
				categoryCount++;
			}
			if (remainingCharacter == false && password.substring(i, i + 1).matches("[^a-zåäöA-ZÅÄÖ0-9]")) {
				remainingCharacter = true;
				categoryCount++;
			}
			if (categoryCount >= 3) {
				return true;
			}
		}
		return false;

	}
}
