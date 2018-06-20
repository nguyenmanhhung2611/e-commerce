package main;

/*
 * hungnm
 * */

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

import utils.Common;

public class Product {

	private String name;

	private float price;

	private float marketPrice;

	/*
	 * custom attributes
	 * */
	private JSONObject optionField = new JSONObject();

	private List<String> images = new ArrayList<>();

	private String color;

	private String storage;

	private String description;

	private String origin;

	private Timestamp factoryDate;

	private float weight;
	

	/* --- Constructor --- */
	public Product() {
		
	}

	public Product(String name, float price, float marketPrice, JSONObject optionField, String[] images,
			String color, String storage, String description, String origin, String factoryDate, float weight) {
		super();
		this.name = name;
		this.price = price;
		this.marketPrice = marketPrice;
		this.optionField = optionField;
		this.images = Arrays.asList(images);
		this.color = color;
		this.storage = storage;
		this.description = description;
		this.origin = origin;
		this.factoryDate = Common.getTimestampByString(factoryDate);
		this.weight = weight;
	}

	
	/* --- Set properties --- */
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setMarketPrice(float marketPrice) {
		this.marketPrice = marketPrice;
	}

	public void setOptionField(JSONObject optionField) {
		this.optionField = optionField;
	}

	public void setImages(String[] images) {
		this.images = Arrays.asList(images);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setFactoryDate(Timestamp factoryDate) {
		this.factoryDate = factoryDate;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	
	/* --- Get properties --- */
	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public float getMarketPrice() {
		return marketPrice;
	}

	public JSONObject getOptionField() {
		return optionField;
	}

	public List<String> getImages() {
		return images;
	}

	public String getColor() {
		return color;
	}

	public String getStorage() {
		return storage;
	}

	public String getDescription() {
		return description;
	}

	public String getOrigin() {
		return origin;
	}

	public Timestamp getFactoryDate() {
		return factoryDate;
	}

	public float getWeight() {
		return weight;
	}

	
	/* --- Methods --- */
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
