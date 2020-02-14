import java.util.Scanner;

public class RegExValidateSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size: ");
		String size = input.nextLine();
		if (size.matches("X[SL]|M|S|L")) {
			System.out.println("OK");
		} else
			System.out.println("Invalid size");
		input.close();
	}

}
