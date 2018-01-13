import javax.xml.parsers.*;

import org.xml.sax.InputSource;
import org.w3c.dom.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Folders {
    private static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
        Collection<String> folders = new ArrayList<>();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xml));

            Document doc = db.parse(is);
            NodeList nodes = doc.getElementsByTagName("folder");

            for (int i = 0; i < nodes.getLength(); i++) {
                String element = ((Element) nodes.item(i)).getAttribute("name");
                System.out.println("Not output: " + element);
                if (element.startsWith(Character.toString(startingLetter))) {
                    folders.add(element);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return folders;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for (String name : names)
            System.out.println(name);
    }
}