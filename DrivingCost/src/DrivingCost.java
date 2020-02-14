import java.text.DecimalFormat;
import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter driven kilometers: ");
		double drivenKm = readDouble(input);
		System.out.print("Enter amount of fuel consumed: ");
		double fuel = readDouble(input);
		System.out.print("Enter fuel price per liter: ");
		double pricePerLiter = readDouble(input);
		double cost = (pricePerLiter * fuel) / drivenKm;
		System.out.println();
		System.out.println("The cost per kilometer is " + twoDecimals.format(cost) + " euros.");

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}
