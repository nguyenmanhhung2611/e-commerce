package main;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import utils.ENUM;

public class Main {

	public static void main(String[] args) {
		
		/*1. Create a product with name Iphone X 64Gb Black price $999 (decimal),
		market price $1099, 3 images, color Black, storage 64Gb, along with some
		specific attributes: description (long text), origin (text), factory date (date
		time), weight (float)*/
		Product product1 = new Product("Iphone X 64Gb", 999, 1099, new JSONObject(), 
				new String[]{"1.jpg", "2.jpg", "3.jpg"}, ENUM.Color.BLACK.get(), ENUM.Storage._64GB.get(), 
				"desc 64GB", "USA", "20-02-2018 20:21:02", 0.5F);
		System.out.println("1 ================================================");
		System.out.println(product1.toString());
		
		
		
		/*2. Create a product with name Iphone X 128Gb Yellow price $950 (decimal),
		market price $1050, 3 images, color Yellow, storage 128Gb, along with
		some specific attributes: description (long text), origin (text), factory date
		(date time), weight (float)*/
		Product product2 = new Product("Iphone X 128Gb", 950, 1050, new JSONObject(), 
				new String[]{"4.jpg", "5.jpg", "6.jpg"}, ENUM.Color.YELLOW.get(), ENUM.Storage._128GB.get(), 
				"desc 128GB", "USA", "28-05-2018 10:18:22", 0.7F);
		System.out.println("2 ================================================");
		System.out.println(product2.toString());
		
		
		
		/*3. Create a configurable product named Iphone X that is combination of the 2 products above.*/
		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		ConfigurableProduct product3 = new ConfigurableProduct("Iphone X", 980, 1090, new JSONObject(), 
				new String[]{"7.jpg", "8.jpg", "9.jpg"}, "desc iphoneX", "USA", "02-09-2018 02:18:12", products);
		System.out.println("3 ================================================");
		System.out.println(product3.toString());
		
		
		/* Assign value after user choose value in colors, weights, storages */
		product3.setColor(product1.getColor());
		product3.setWeight(product1.getWeight());
		product3.setStorage(product1.getStorage());
		System.out.println(product3.toString());
	}
	
}
