
public class ObjectsPizzaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza[] pizzaArray = {
				new Pizza("Diavolo", 8.75),
				new Pizza("Frutti al Mare", 9.00),
				new Pizza("Alla Pollo", 7.50)
		};
		for(Pizza i: pizzaArray)
			System.out.println(i.toString());
	}

}
