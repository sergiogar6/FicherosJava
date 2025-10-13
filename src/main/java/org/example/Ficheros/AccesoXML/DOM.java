package org.example.Ficheros.AccesoXML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DOM {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element rootElement = doc.createElement("inventions");
        doc.appendChild(rootElement);

        Element invention1 = doc.createElement("invention");
        invention1.setAttribute("id", "1");
        rootElement.appendChild(invention1);

        Element name1 = doc.createElement("name");
        name1.appendChild(doc.createTextNode("Falcon 9"));
        invention1.appendChild(name1);

        Element year1 = doc.createElement("year");
        year1.appendChild(doc.createTextNode("2010"));
        invention1.appendChild(year1);

        Element area1 = doc.createElement("area");
        area1.appendChild(doc.createTextNode("Aeroespacial"));
        invention1.appendChild(area1);




        Element invention2 = doc.createElement("invention");
        invention2.setAttribute("id", "2");
        rootElement.appendChild(invention2);

        Element name2 = doc.createElement("name");
        name2.appendChild(doc.createTextNode("Tesla Model S"));
        invention2.appendChild(name2);

        Element year2 = doc.createElement("year");
        year2.appendChild(doc.createTextNode("2012"));
        invention2.appendChild(year2);

        Element area2 = doc.createElement("area");
        area2.appendChild(doc.createTextNode("Automoción eléctrica"));
        invention2.appendChild(area2);





        Element invention3 = doc.createElement("invention");
        invention3.setAttribute("id", "3");
        rootElement.appendChild(invention3);

        Element name3 = doc.createElement("name");
        name3.appendChild(doc.createTextNode("Starlink"));
        invention3.appendChild(name3);

        Element year3 = doc.createElement("year");
        year3.appendChild(doc.createTextNode("2019"));
        invention3.appendChild(year3);

        Element area3 = doc.createElement("area");
        area3.appendChild(doc.createTextNode("Telecomunicaciones"));
        invention3.appendChild(area3);




        Element invention4 = doc.createElement("invention");
        invention4.setAttribute("id", "4");
        rootElement.appendChild(invention4);

        Element name4 = doc.createElement("name");
        name4.appendChild(doc.createTextNode("Neuralink"));
        invention4.appendChild(name4);

        Element year4 = doc.createElement("year");
        year4.appendChild(doc.createTextNode("2016"));
        invention4.appendChild(year4);

        Element area4 = doc.createElement("area");
        area4.appendChild(doc.createTextNode("Neurotecnología"));
        invention4.appendChild(area4);




        TransformerFactory transformeFactory = TransformerFactory.newInstance();
        Transformer transformer = transformeFactory.newTransformer();

        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); // cabecera con UTF-8
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");     // intenta indentar

        // Pasamos nuestro documento a un objeto de DestinoDOM con la clase DOMSource
        DOMSource fuente = new DOMSource(doc);

        // Preparamos el fichero en el que vamos a volcar el XML
        File archivo = new File("inventions.xml");
        StreamResult destino = new StreamResult(archivo);

        transformer.transform(fuente, destino);

        System.out.println("******** Archivo XML creado exitosamente");



    }
}
