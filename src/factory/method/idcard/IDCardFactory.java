package factory.method.idcard;


import java.util.ArrayList;
import java.util.List;

import factory.method.framwork.Factory;
import factory.method.framwork.Product;

public class IDCardFactory extends Factory {
	
	private List owners = new ArrayList();

	public List getOwners() {
		return owners;
	}

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
}
