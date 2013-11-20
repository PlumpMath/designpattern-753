package factory.method.idcard;

import factory.method.framwork.Product;

public class IDCard extends Product {
	
	private String owner;
	public IDCard(String owner) {
		System.out.println(owner + "のカードを作ります");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "のカードを使います");
	}
	
	public String getOwner() {
		return this.owner;
	}

}
