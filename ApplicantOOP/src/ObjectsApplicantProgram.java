import java.util.Scanner;

public class ObjectsApplicantProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Applicant[] appArray = new Applicant[4];
		Scanner input = new Scanner(System.in);
		String text;
		int number;
		for (int i = 0; i < appArray.length; i++) {
			System.out.print("Enter " + (i + 1) + ". name: ");
			text = input.nextLine();
			System.out.print("Enter points: ");
			number = Integer.parseInt(input.nextLine());
			appArray[i] = new Applicant(text, number);
		}
		System.out.print("Enter the minimum of required points: ");
		int minPoint = Integer.parseInt(input.nextLine());
		
		System.out.println("The following applicants achived the minimum of " + minPoint + " points:");
		for (int i = 0; i < appArray.length; i++) {
			if (appArray[i].getPoints() >= minPoint)
				System.out.println(appArray[i].getName() + ", " + appArray[i].getPoints() + " points");
		}
		input.close();
	}

}
