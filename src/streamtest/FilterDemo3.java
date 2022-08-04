package streamtest;

import java.util.ArrayList;
import java.util.List;

class Product {

	int id;
	String name;
	double price;

	public Product() {

	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class FilterDemo3 {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "HP Laptop", 25000));
		products.add(new Product(2, "DELL Laptop", 30000));
		products.add(new Product(3, "LENOVO Laptop", 28000));
		products.add(new Product(4, "SONY Laptop", 23000));
		products.add(new Product(5, "APPLE Laptop", 90000));

	    products.stream().filter(p -> p.price > 25000).forEach(pr -> System.out.println(pr.price));

	}

}
