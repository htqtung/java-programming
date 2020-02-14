import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter a decimal number: ");
		double a = readDouble(input);
		System.out.println(twoDecimals.format(a));

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
