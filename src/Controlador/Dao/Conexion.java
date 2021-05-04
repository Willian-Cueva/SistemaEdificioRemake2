/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Dao;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
/**
 *
 * @author Willian
 */
public class Conexion {
    private String REPO="datos";
    private XStream xStream;

    public Conexion() {
        xStream = new XStream(new JettisonMappedXmlDriver());
        xStream.setMode(XStream.NO_REFERENCES);
    }    
    
    public String getDireccion() {
        return REPO;
    }

    public XStream getxStream() {
        return xStream;
    }

}
