import java.text.DecimalFormat;
import java.util.Scanner;

public class AgentCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter selling price: ");
		double price = readDouble(input);
		double commission = price * 3.44 / 100;
		if (commission < 2400) {
			commission = 2400;
		}
		System.out.println();
		System.out.println("The commission is " + twoDecimals.format(commission) + " euros.");

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
