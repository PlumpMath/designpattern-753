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
		
		// Linkfactory
		Factory factory = Factory.getFactory("abstractfactory.listfactory.ListFactory");
		
		Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://yahoo.co.jp/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("サーチエンジン");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "yukiko kato");
		page.add(traynews);
		page.add(traysearch);
		page.output();
		
		// TableFactory
		Factory tablefactory = Factory.getFactory("abstractfactory.tablefactory.TableFactory");

		asahi = tablefactory.createLink("朝日新聞", "http://www.asahi.com/");
		yomiuri = tablefactory.createLink("読売新聞", "http://www.yomiuri.co.jp/");
		
		us_yahoo = tablefactory.createLink("Yahoo!", "http://www.yahoo.com/");
		jp_yahoo = tablefactory.createLink("Yahoo!Japan", "http://yahoo.co.jp/");
		excite = tablefactory.createLink("Excite", "http://www.excite.com/");
		google = tablefactory.createLink("Google", "http://www.google.com/");
		
		traynews = tablefactory.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);
		
		trayyahoo = tablefactory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		traysearch = tablefactory.createTray("サーチエンジン");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);

		Page tablePage = tablefactory.createPage("TablePage", "yukiko kato");
		tablePage.add(traynews);
		tablePage.add(traysearch);
		tablePage.output();

	}

}
