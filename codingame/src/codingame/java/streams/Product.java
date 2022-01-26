package codingame.java.streams;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {

		List<Product> produits = new ArrayList<Product>();
		produits.add(new Product(1, "tv toshiba", 23000f));
		produits.add(new Product(2, "HP Laptop", 25000f));
		produits.add(new Product(3, "Spart phone", 13400f));
		produits.add(new Product(4, " Printer lenovo", 30000f));
		List<Float> productPriceList = new ArrayList<Float>();

//		for (Product product : produits) {
//			if (product.price < 30000) {
//				productPriceList.add(product.price);
//			}
//		}

		System.out.println("the list of prices: " + productPriceList);
	}

}