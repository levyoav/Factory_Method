package main;

import products.Product;
import creators.ConcreteCreator;


public class Client {
	public static void main(String[] args) {
		//May get it through a Factory maker.
		ConcreteCreator creator = new ConcreteCreator();

		//Through the createProduct() method of the ConcreteCreator we can choose
		//which subclass of Product to instantiate to the Product reference p 
		//without even importing it. By implementing another class like the 
		//ConcreteCreator and overriding its createProduct() method, we could 
		//choose to instantiate a different subclass of Product (if there were 
		//any in this example).
		Product p = creator.createProduct();
		p.execute();

		//In order to instantiate an instance of ConcreteProduct directly form
		//the class, we would need to import the class (unlike using the
		//ConcreteCreator class).
//		ConcreteProduct p1 = new ConcreteProduct();
	}
}
