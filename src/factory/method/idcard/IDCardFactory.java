package factory.method.idcard;


import java.util.HashMap;

import factory.method.framwork.Factory;
import factory.method.framwork.Product;

public class IDCardFactory extends Factory {
	
	private HashMap<String, Integer> database = new HashMap<String, Integer>();
	private int serial = 100;

	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	@Override
	protected void registerProduct(Product product) {
		IDCard card = (IDCard) product;
		database.put(card.getOwner(), new Integer(card.getSerial()));
	}
	
	public HashMap<String, Integer> getDatabase() {
		return database;
	}
}
