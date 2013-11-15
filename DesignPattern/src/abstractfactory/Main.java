package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Factory factory = Factory.getFactory("abstractfactory.listfactory.ListFactory");
		
		Link asahi = factory.createLink("�����V��", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("�ǔ��V��", "http://www.yomiuri.co.jp/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("�V��");
		traynews.add(asahi);
		traynews.add(yomiuri);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("�T�[�`�G���W��");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "yukiko kato");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}

}
