package abstractfactory.tablefactory;

import javax.swing.text.html.HTMLDocument.Iterator;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

public class TableTray extends Tray {

	public TableTray(String caption) {
		super(caption);
	}
	
	@Override
	public String makeHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<td>");
		sb.append("<table width=\"100%\" border=\"1\"><tr>");
		sb.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
		sb.append("</tr>\n");
		sb.append("<tr>\n");
		Iterator iterator = tray.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
		}
	}

}
