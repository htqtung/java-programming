import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		String[] bloodTypes = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };
		Scanner input = new Scanner(System.in);
		System.out.print("Enter blood type: ");
		String bloodType = input.nextLine();
		int counter = 0;
		for (int i = 0; i < bloodTypes.length; i++) {
			if (bloodType.equals(bloodTypes[i])) {
				counter++;
			}
		}
		System.out.println(oneDecimal.format(counter * 100 / bloodTypes.length) + " %");
		input.close();
	}
}
