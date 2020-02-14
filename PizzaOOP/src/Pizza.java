import java.text.DecimalFormat;

public class Pizza {
	private String name;
	private double price;
	
	public Pizza(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		String text = name + " (" + twoDecimals.format(price) + " euros)";
		text = text.replace('.', ',');
		return text;
	}
}
