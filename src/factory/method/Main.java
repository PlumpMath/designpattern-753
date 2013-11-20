package factory.method;

import factory.method.framwork.Factory;
import factory.method.framwork.Product;
import factory.method.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("田中");
		Product card2 = factory.create("鈴木");
		Product card3 = factory.create("高島");
		card1.use();
		card2.use();
		card3.use();
		
	}
}
