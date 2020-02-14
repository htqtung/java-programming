import java.text.DecimalFormat;
import java.util.Scanner;

public class CarSharing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter driven kilometers: ");
		double drivenKm = readDouble(input);
		System.out.print("Enter fuel consumption per 100 km: ");
		double fuelConsumption = readDouble(input);
		System.out.print("Enter fuel price per liter: ");
		double fuelPrice = readDouble(input);
		System.out.print("Enter number of people: ");
		int numOfPeople = Integer.parseInt(input.nextLine());
		double tripCost = fuelConsumption * (drivenKm / 100) * fuelPrice;
		double costPerPerson = tripCost / numOfPeople;
		System.out.println();
		System.out.println(
				"Each of the " + numOfPeople + " people should pay " + twoDecimals.format(costPerPerson) + " euros.");

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}