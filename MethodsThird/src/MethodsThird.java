import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		double grossSalary = 0;
		double taxRate = 0;
		double netSalary = 0;
		System.out.print("Enter gross salary: ");
		grossSalary = readDouble(input);
		System.out.print("Enter income tax rate: ");
		taxRate = readDouble(input);
		netSalary = calculateNetSalary(grossSalary, taxRate);
		System.out.println("The net salary is " + twoDecimals.format(netSalary));

		input.close();
	}

	private static double calculateNetSalary(double grossSalary, double taxRate) {
		double netSalary;
		netSalary = grossSalary * (100 - taxRate) / 100;
		return netSalary;
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
