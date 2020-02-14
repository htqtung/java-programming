import java.util.Scanner;

public class MethodsMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double num1, num2;
		System.out.print("Enter first double: ");
		num1 = readDouble(input);
		System.out.print("Enter second double: ");
		num2 = readDouble(input);
		double max = max(num1, num2);
		System.out.println("The max value is " + max);

		input.close();
	}

	private static double max(double num1, double num2) {
		if (num1 >= num2)
			return num1;
		else
			return num2;
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
