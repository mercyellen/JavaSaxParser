/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxparsertodom;

import java.util.ArrayList;

/**
 *
 * @author mercyhoush
 */
public class XMLNode {
    public ArrayList<XMLNode> properties = new ArrayList<>();
    public ArrayList<Attributes> attributes = new ArrayList<>();
    public String content = new String();
    public String name = new String();
    
    public ArrayList<Attributes> getAttributes() {
        return attributes;
    }
}
