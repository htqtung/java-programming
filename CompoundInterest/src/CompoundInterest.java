import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		double balance, rate, taxRate, annualInterest;
		int year;
		System.out.print("Enter initial deposit: ");
		balance = readDouble(input);
		System.out.print("Enter interest rate: ");
		rate = readDouble(input);
		System.out.print("Enter capital income tax rate: ");
		taxRate = readDouble(input);
		System.out.print("Enter number of years: ");
		year = Integer.parseInt(input.nextLine());
		for (int i = 1; i <= year; i++) {
			annualInterest = (balance * rate / 100) * (100 - taxRate) / 100;
			balance += annualInterest;
			System.out.println(i + ": " + twoDecimals.format(balance));
		}
		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
