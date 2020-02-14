import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String txtGrade = "";
		int grade = 0;
		String feedback = "";
		boolean isNumber = false;
		boolean isValid = false;
		while (isValid == false) {
			while (isNumber == false) {
				try {
					System.out.print("Enter grade (0-5): ");
					// Store the input as text
					txtGrade = input.nextLine();
					// Try to parse the input into integer
					grade = Integer.parseInt(txtGrade);
					// Assume that it is a number
					isNumber = true;
				} catch (NumberFormatException nfe) {
					feedback = txtGrade + " is not a valid grade.";
					// The exception happens means that it is not a number ->
					// back to the beginning of the loop
					isNumber = false;
					System.out.println(feedback);
				}
			}
			// Assume that the number is valid
			isValid = true;
			if (grade < 0 || grade > 5) {
				// The number is not valid, prompt the user for input again
				// (check IsNumber and IsValid so set both to False)
				isValid = false;
				isNumber = false;
				feedback = grade + " is not a valid grade.";
				System.out.println(feedback);
			} else {
				feedback = "OK";
				System.out.println(feedback);
			}
		}

		input.close();
	}
}