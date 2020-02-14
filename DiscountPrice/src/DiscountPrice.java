import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter original price: ");
		double price = readDouble(input);
		System.out.print("Enter discount percentage: ");
		double percent = readDouble(input);
		double discountPrice = price * (100 - percent) / 100;
		System.out.println("The final price is " + twoDecimals.format(discountPrice));

		input.close();
	}

	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}
}