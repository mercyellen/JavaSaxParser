/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparsertodom;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author mercyhoush
 */
public class Loader {
    public static XMLNode load(File xmlFile) throws Exception {
        XMLNode firstNode = new XMLNode();
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            
            
            DefaultHandler handler = new DefaultHandler() {
                ArrayList<XMLNode> nodeArray = new ArrayList<XMLNode>();
                int depth = 0;
                
                public void beginning(String uri, String name, String qName, Attributes attributes) {
                    XMLNode node = null;
                    if(depth == 0) node = firstNode;
                    else {
                        node = new XMLNode();
                        nodeArray.get(depth -1).properties.add(node);
                    }
                    nodeArray.add(depth, node);
                    node.name = qName;
                    depth = depth + 1;
                }
        } catch(Exception ex) {
        throw ex;
        }
    }
        return firstNode;
    } 
            
}
