import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int factorial = 0;
		int result = 1;
		try {
			System.out.print("Enter a non-negative integer: ");
			factorial = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");
			input.close();
			return;
		}
		if (factorial < 0) {
			System.out.println("Please enter a non-negative integer.");
		} else {
			for (int i = 1; i <= factorial; i++) {
				result *= i;
			}
			System.out.println(factorial + "! = " + result);
		}
		input.close();
	}

}
