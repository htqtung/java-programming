import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter price for a single ticket: ");
		double singlePrice = readDouble(input);
		System.out.print("Enter price for a season ticket: ");
		double seasonPrice = readDouble(input);
		System.out.print("Enter the number of bus trips per month: ");
		double numOfBusTrip = readDouble(input);
		double singleCost = singlePrice * numOfBusTrip;
		if (singleCost < seasonPrice) {
			System.out.println();
			System.out.println(
					"Buying single tickets is " + twoDecimals.format(seasonPrice - singleCost) + " euros cheaper.");
		} else if (singleCost == seasonPrice) {
			System.out.println();
			System.out.println("There is no difference in the price.");
		} else {
			System.out.println();
			System.out.println(
					"Buying a season ticket is " + twoDecimals.format(singleCost - seasonPrice) + " euros cheaper.");
		}
		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}
