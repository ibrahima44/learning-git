package com.sirius.demo;

import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class Teste {
	
	public  static String toStringg(Document newDoc) throws Exception{
		DOMSource domSource = new DOMSource(newDoc);
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		StringWriter sw = new StringWriter();
		StreamResult sr = new StreamResult(sw);
		transformer.transform(domSource, sr);
		//System.out.println(sw.toString());  
		return sw.toString();
	}
	public static void main(String[] args) {
		Document = "";
		Teste tt = new Teste();
		tt.toStringg();

	}

}
