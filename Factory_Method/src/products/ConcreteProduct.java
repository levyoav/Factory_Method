package products;



/*
 * Implements the Product interface.
 */
public class ConcreteProduct extends Product {

	@Override
	public void execute() {
		System.out.println("Hello Factory Pattern.");
	}

}
