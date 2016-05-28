package creators;

import products.ConcreteProduct;
import products.Product;


//Concrete Creator
/*
 * Overrides the factory method to return an instance of a ConcreteProduct.
 */
public class ConcreteCreator extends Creator {

	@Override
	public Product createProduct() {
		return new ConcreteProduct();
	}

}
