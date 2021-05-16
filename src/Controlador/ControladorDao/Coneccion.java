/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

/**
 *
 * @author Willian
 */
public class Coneccion {
    private String REPO = "datos";
    private XStream xStream;

    public Coneccion() {
        xStream = new XStream(new JsonHierarchicalStreamDriver());
        xStream.setMode(XStream.NO_REFERENCES);
    }
  
    public String getREPO() {
        return REPO;
    }

    public XStream getxStream() {
        return xStream;
    }
    
}
