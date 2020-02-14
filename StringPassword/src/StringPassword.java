import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = input.nextLine();
		System.out.print("Enter password: ");
		String password = input.nextLine();
		if (validatePassword(username.toLowerCase(), password.toLowerCase())) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}

		input.close();
	}

	private static boolean validatePassword(String username, String password) {
		if ((password.indexOf(username) != -1) || password.length() < 8) {
			return false;
		}
		return true;
	}

}
