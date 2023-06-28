/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import Domain.User;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 *
 * @author fuent
 */
public class UsuarioXML {

    String ruta;
    Document document;
    Element rootElement;

    public UsuarioXML() {
        rootElement = new Element("Usuarios");
        document = new Document(rootElement);
    }

    public void guardarRegistroUsuario(User user) throws JDOMException, IOException {
        Element rootEleme = new Element("Usuario");

        Element userE = new Element("user");
        userE.addContent(user.getUser());

        Element nombreElement = new Element("name");
        nombreElement.addContent(user.getName());

        Element contraseñaElement = new Element("password");
        contraseñaElement.addContent(user.getPassword() + "");

        rootEleme.addContent(userE);
        rootEleme.addContent(nombreElement);
        rootEleme.addContent(contraseñaElement);
        this.rootElement.addContent(rootEleme);
        guardarArchivoXML(document, "usuarios.xml");
    }

    private void guardarArchivoXML(Document document, String nombreArchivo) throws JDOMException, IOException {
        this.ruta = nombreArchivo;
        XMLOutputter xmlOutputter = new XMLOutputter();

        Format format = Format.getPrettyFormat();
        xmlOutputter.setFormat(format);

        File archivo = new File(this.ruta);
        if (archivo.exists()) {
            xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
            xmlOutputter.output(document, new FileWriter("usuarios.xml"));
            System.out.println("creado");
        } else {
            rootElement = new Element("Usuarios");
            xmlOutputter.output(this.document, new PrintWriter(this.ruta));
            System.out.println("Archivo XML guardado exitosamente.");
        }
    }

    public String recuperarUser() {
        /*
        solo me imprime el ultimo o primer user, no recorre como
        tal a todos los usuarios
         */

        SAXBuilder builder = new SAXBuilder();
        File xml = new File("usuarios.xml");

        try {
            document = builder.build(xml);
            rootElement = document.getRootElement();

            List<Element> list = rootElement.getChildren("Usuario");
            for (int i = 0; i < list.size(); i++) {

                Element campo = list.get(i);

                String user = campo.getChildTextTrim("user");

                return user;
            }

        } catch (JDOMException | IOException ex) {
            Logger.getLogger(UsuarioXML.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";

    }

} //class
