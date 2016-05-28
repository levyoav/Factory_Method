package dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

//An example of how DOM uses both Abstract Factory & Factory Method patterns. 
public class DOMExample {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder(); //Factory Method.

			Document doc = parser.parse("someLocation.xml"); //Factory Method.
			Element root = doc.getDocumentElement();

			Element title = doc.createElement("title"); //Abstract Factory.
			Attr attribute = doc.createAttribute("id"); //Abstract Factory.
			attribute.setValue("8");

			Text text = doc.createTextNode("my new title"); //Abstract Factory.


		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
