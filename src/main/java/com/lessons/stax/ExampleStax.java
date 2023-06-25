package com.lessons.stax;

import javax.xml.stream.*;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringWriter;

public class ExampleStax {

    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {


        StringWriter sw = new StringWriter();
        XMLOutputFactory of = XMLOutputFactory.newInstance();
        XMLEventWriter xw = null;
        XMLInputFactory f = XMLInputFactory.newInstance();
        XMLEventReader xr = f.createXMLEventReader(new FileInputStream("test.xml"));
        while (xr.hasNext()) {
            XMLEvent e = xr.nextEvent();
            if (e.isStartElement()
                    && ((StartElement) e).getName().getLocalPart().equals("tagINeed")) {
                xw = of.createXMLEventWriter(sw);
            } else if (e.isEndElement()
                    && ((EndElement) e).getName().getLocalPart().equals("tagINeed")) {
                break;
            } else if (xw != null) {
                xw.add(e);
            }
        }
        xw.close();
        System.out.println(sw);

    }
}
