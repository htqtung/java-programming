import java.util.Scanner;

public class RegExValidateStudentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter student number: ");
		String size = input.nextLine();
		if (size.matches("[0-9]{7}")) {
			System.out.println("OK");
		} else
			System.out.println("Invalid student number");
		input.close();
	}

}
