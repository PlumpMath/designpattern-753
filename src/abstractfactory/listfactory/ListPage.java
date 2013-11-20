package abstractfactory.listfactory;

import java.util.Iterator;

import abstractfactory.factory.Item;
import abstractfactory.factory.Page;

public class ListPage extends Page{
	public ListPage(String title, String author) {
		super(title, author);
	}
	public String makeHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>" + title + "</title></head>\n");
		sb.append("<body>\n");
		sb.append("<h1>" + title + "</h1>\n");
		sb.append("<ul>\n");
		Iterator<Item> iterator = content.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("<hr><address>" + author + "</address>");
		sb.append("</body></html>\n");
		return sb.toString();
	}
}
