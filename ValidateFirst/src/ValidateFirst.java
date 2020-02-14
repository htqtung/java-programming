import java.util.Scanner;

public class ValidateFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter grade (0-5): ");
		try {
			int grade = Integer.parseInt(input.nextLine());
			if (grade < 0 || grade > 5) {
				System.out.println("Please enter an integer between 0 and 5.");
			} else
				System.out.println("OK");
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter an integer");
		}

		input.close();
	}

}
