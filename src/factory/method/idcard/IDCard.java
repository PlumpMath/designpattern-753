package factory.method.idcard;

import factory.method.framwork.Product;

public class IDCard extends Product {
	
	private String owner;
	private int serial;
	public IDCard(String owner, int serial) {
		System.out.println(owner + "(" + serial + ")のカードを作ります");
		this.owner = owner;
		this.serial = serial;
	}

	@Override
	public void use() {
		System.out.println(owner + "(" + serial + ")のカードを使います");
	}
	
	public String getOwner() {
		return this.owner;
	}
	public int getSerial() {
		return serial;
	}
}
