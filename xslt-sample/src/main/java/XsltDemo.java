import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.util.Properties;


public class XsltDemo {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        Properties properties = System.getProperties();
        String userDir = properties.getProperty("user.dir");
        File dataFile = new File(userDir + "\\xslt-sample\\src\\main\\resources\\data.xml");
        File stylesheet = new File(userDir + "\\xslt-sample\\src\\main\\resources\\stylesheet.xsl");

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document document = builder.parse(dataFile);

        StreamSource streamSource = new StreamSource(stylesheet);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Result outputTarget = new StreamResult();
        transformer.transform(streamSource, outputTarget);

        System.out.println(dataFile.canRead());
        System.out.println(stylesheet.canRead());
    }
}
