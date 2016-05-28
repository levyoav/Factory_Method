package creators;

import products.Product;


//Abstract Creator
/*
 * It declares the factory method that returns an object of type Produce.
 */
public abstract class Creator {
	abstract Product createProduct();
}
