package main;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

import utils.Common;

/*
 * hungnm
 * */

public class ConfigurableProduct extends Product {
	
	private List<String> colors = new ArrayList<>();
	private List<Float> weights = new ArrayList<>();
	private List<String> storages = new ArrayList<>();

	/* --- Constructors --- */
	public ConfigurableProduct() {
		super();
	}

	public ConfigurableProduct(String name, float price, float marketPrice, JSONObject optionField, String[] images,
			String description, String origin, String factoryDate, List<Product> products) {
		this.setName(name);
		this.setPrice(price);
		this.setMarketPrice(marketPrice);
		this.setOptionField(optionField);
		this.setImages(images);
		this.setDescription(description);
		this.setOrigin(origin);
		this.setFactoryDate(Common.getTimestampByString(factoryDate));
		for (Product product : products) {
			colors.add(product.getColor());
			weights.add(product.getWeight());
			storages.add(product.getStorage());
		}
	}

	/* --- Set - Get Properties --- */
	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public List<Float> getWeights() {
		return weights;
	}

	public void setWeights(List<Float> weights) {
		this.weights = weights;
	}

	public List<String> getStorages() {
		return storages;
	}

	public void setStorages(List<String> storages) {
		this.storages = storages;
	}
	
	
	/* --- Methods --- */
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
}
