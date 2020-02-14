import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageOfDecimalValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		List<Double> decimals = new ArrayList<Double>();
		System.out.print("Enter first number (zero ends): ");
		double userInput = readDouble(input);
		double total = 0, average;
		if (userInput == 0) {
			System.out.println("Nothing to calculate");
		} else {
			while (userInput != 0) {
				decimals.add(new Double(userInput));
				System.out.print("Enter next number (zero ends): ");
				userInput = readDouble(input);
			}
			for (int i = 0; i < decimals.size(); i++) {
				Double decimalObject = decimals.get(i);
				total += decimalObject;
			}
			average = total / decimals.size();
			System.out.println("The average is " + twoDecimal.format(average));
		}

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
