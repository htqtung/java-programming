import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat commaDecimal = new DecimalFormat("0.00");
		System.out.print("Enter your hourly wage: ");
		double wage = readDouble(input);
		double grossPay = 0;
		System.out.print("Enter the number of days: ");
		int numOfDay = Integer.parseInt(input.nextLine());
		int[] workHour = new int[numOfDay];
		for (int i = 0; i < workHour.length; i++) {
			System.out.print("Hours worked on day " + (i + 1) + ": ");
			workHour[i] = Integer.parseInt(input.nextLine());
		}
		int totalWorkHour = 0;
		for (int i = 0; i < workHour.length; i++) {
			totalWorkHour += workHour[i];
		}
		System.out.println("");
		System.out.println("Total work hours is " + totalWorkHour);
		for (int i = 0; i < workHour.length; i++) {
			if (workHour[i] <= 8) {
				grossPay += (wage * workHour[i]);
			} else {
				grossPay += ((8 * wage) + ((workHour[i] - 8) * (wage + wage / 2)));
			}
		}
		System.out.println("Gross pay is " + commaDecimal.format(grossPay));
		System.out.print("You entered the following daily hours: ");
		for (int i = 0; i < workHour.length; i++)
			System.out.print(workHour[i] + " ");

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
