import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String first, second;
		System.out.print("Enter first string: ");
		first = input.nextLine();
		System.out.print("Enter second string: ");
		second = input.nextLine();
		if (isAnagram(first, second)) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No anagram.");
		}
		input.close();
	}

	private static boolean isAnagram(String a, String b) {
		a = a.trim();
		a = a.toLowerCase();
		b = b.trim();
		b = b.toLowerCase();
		a = a.replaceAll("\\s", "");
		a = a.replaceAll(",", "");
		a = a.replaceAll("\\.", "");
		b = b.replaceAll("\\s", "");
		b = b.replaceAll(",", "");
		b = b.replaceAll("\\.", "");
		// System.out.println(a);
		// System.out.println(b);
		if (a.length() == 0 || b.length() == 0 || a.length() != b.length()) {
			return false;
		}
		if (a.matches("[a-zA-Z0-9]{1,}") && b.matches("[a-zA-Z0-9]{1,}") && !a.matches("[0-9]{1,}")) {
			char[] aArray = a.toCharArray();
			char[] bArray = b.toCharArray();
			Arrays.sort(aArray);
			Arrays.sort(bArray);
			a = new String(aArray);
			// System.out.println(a);
			b = new String(bArray);
			// System.out.println(b);
			if (a.equals(b)) {
				return true;
			} else
				return false;
		} else {
			return false;
		}

	}
}
