package factory.method;

import factory.method.framwork.Factory;
import factory.method.framwork.Product;
import factory.method.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("�c��");
		Product card2 = factory.create("���");
		Product card3 = factory.create("����");
		card1.use();
		card2.use();
		card3.use();
		
	}
}
