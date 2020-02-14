
public class ObjectsWordPairProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordPair w1 = new WordPair("class", "luokka");
		WordPair w2 = new WordPair("object", "olio");
		WordPair w3 = new WordPair("variable", "muuttuja");
		
		System.out.println(w1.getEnglishWord() + " = " + w1.getFinnishWord());
		System.out.println(w2.getEnglishWord() + " = " + w2.getFinnishWord());
		System.out.println(w3.getEnglishWord() + " = " + w3.getFinnishWord());
	}

}
