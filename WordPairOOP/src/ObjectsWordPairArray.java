
public class ObjectsWordPairArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordPair[] wpArray = new WordPair[3];
		wpArray[0] = new WordPair("class", "luokka");
		wpArray[1] = new WordPair("object", "olio");
		wpArray[2] = new WordPair("variable", "muuttuja");

		for (WordPair i : wpArray)
			System.out.println(i.getEnglishWord() + " = " + i.getFinnishWord());
	}

}
