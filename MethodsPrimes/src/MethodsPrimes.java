
public class MethodsPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int pivot = 2;
		while (counter < 20) {
			if (!isPrime(pivot)) {
				pivot++;
			} else {
				System.out.print(pivot + " ");
				pivot++;
				counter++;
			}
		}

	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
