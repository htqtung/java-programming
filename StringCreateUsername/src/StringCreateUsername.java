import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstname = input.nextLine();
		System.out.print("Enter surname: ");
		String surname = input.nextLine();
		String username = createUsername(firstname, surname);
		if (username == "") {
			System.out.println("Not enough letters to create a username!");
		} else
			System.out.println(username);
		input.close();
	}

	private static String createUsername(String first, String sur) {
		String username = "";
		if (first.length() >= 2 && sur.length() >= 3) {
			username = sur.substring(0, 3) + first.substring(0, 2);
		}
		return username.toLowerCase();
	}
}
