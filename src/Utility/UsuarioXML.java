/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import Domain.Friends;
import Domain.Post;
import Domain.User;
import Logic.CircularDoublyList;
import Logic.LinkedQueue;
import Logic.LinkedStack;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jshell.spi.ExecutionControl;
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

    public UsuarioXML() throws JDOMException, IOException {
        this.rootElement = new Element("Usuarios");
        this.document = new Document(rootElement);
        guardarArchivoXML("usuarios.xml");
    }

    public ArrayList<User> recuperarAmigos(String user) {

        ArrayList<User> users = new ArrayList<>();
        List elementListUser = this.rootElement.getChildren();
        for (Object objectActual : elementListUser) {
            Element elementoActual = (Element) objectActual;
            User u = new User(elementoActual.getAttributeValue("user"), "");
            if (u.getUser() == user) {

                List elementListPost2 = elementoActual.getChild("Friends").getChildren();
                for (Object objectActual2 : elementListPost2) {
                    Element elementoActual2 = (Element) objectActual2;
                    User u2 = new User(
                            elementoActual2.getText(),
                            "");
//                    if (u2!=null) {
                        users.add(u2);
//                    }
                    

                }

            }

        }

        return users;
    }

    public void actualizarRequests(String requests, User user) {
        List elementListUser = this.rootElement.getChildren();
        for (Object objectActual : elementListUser) {
            Element elementoActual = (Element) objectActual;
            User u = new User(elementoActual.getAttributeValue("user"), "");

            if (u.getUser().equals(user.getUser())) {
                List elementList2 = elementoActual.getChild("Requests").getChildren();
                for (Object objectActual2 : elementList2) {
                    Element elementoActual2 = (Element) objectActual2;
                    if (elementoActual2.getText().equals(requests)) {
                        try {
                            elementoActual2.setText("");
                            this.rootElement.getContent();
                            guardarXML();
                        } catch (IOException ex) {
                            Logger.getLogger(UsuarioXML.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }

        }

    }

    public ArrayList<User> recuperarUsuarios() {

        ArrayList<User> users = new ArrayList<>();
        List elementListUser = this.rootElement.getChildren();
        for (Object objectActual : elementListUser) {
            Element elementoActual = (Element) objectActual;
            CircularDoublyList cdl = new CircularDoublyList();
            for (int i = 0; i < recuperarAmigos(elementoActual.getAttributeValue("user")).size(); i++) {
                cdl.addEnd(recuperarAmigos(elementoActual.getAttributeValue("user")).get(i));
            }
            User u = new User(elementoActual.getAttributeValue("user"), cdl);

            users.add(u);

        }

        return users;
    }

    public boolean validarAmistad(String friend, String user) {
        for (int i = 0; i < recuperarAmigos(user).size(); i++) {
            if (friend.equals(recuperarAmigos(user).get(i).getUser())) {
                return true;
            }
        }
        return false;

    }

    public LinkedStack recuperarPosts(String user) {
        LinkedStack stack = new LinkedStack();

        List elementListUser = this.rootElement.getChildren();
        for (Object objectActual : elementListUser) {
            Element elementoActual = (Element) objectActual;
            if (validarAmistad(elementoActual.getAttributeValue("user"), user)) {
                for (int j = 0; j < recuperarPost(user).size(); j++) {
                    Post post = (Post) (recuperarPost(user).get(j));
                    stack.push(post.getMessage());
                }
            }
        }
        return stack;
    }

    public ArrayList<Post> recuperarPost(String user) {
        ArrayList<Post> post = new ArrayList<>();
        List elementListUser = this.rootElement.getChildren();

        for (Object objectActual : elementListUser) {
            Element elementoActual = (Element) objectActual;
            User u = new User(elementoActual.getAttributeValue("user"), "");

            if (u.getUser() != user) {
                List elementListPost2 = elementoActual.getChild("Posts").getChildren();
                for (Object objectActual2 : elementListPost2) {
                    Element elementoActual2 = (Element) objectActual2;
                    post.add(new Post(elementoActual2.getText()));
                }
            }

        }

        return post;

    }

    public LinkedQueue recuperarRequests(String user) {
        LinkedQueue queue = new LinkedQueue();

        List elementListUser = this.rootElement.getChildren();
        for (Object objectActual : elementListUser) {
            Element elementoActual = (Element) objectActual;
            if (elementoActual.getAttributeValue("user").equals(user)) {
                for (int j = 0; j < recuperarPost(user).size(); j++) {

                    queue.insert(recuperarRequest(user).get(j));
                }
            }
        }
        return queue;
    }

    public ArrayList<String> recuperarRequest(String user) {
        ArrayList<String> request = new ArrayList<>();
        List elementListUser = this.rootElement.getChildren();

        for (Object objectActual : elementListUser) {
            Element elementoActual = (Element) objectActual;
            User u = new User(elementoActual.getAttributeValue("user"), "");

            if (u.getUser() == user) {
                List elementList2 = elementoActual.getChild("Requests").getChildren();
                for (Object objectActual2 : elementList2) {
                    Element elementoActual2 = (Element) objectActual2;
                    request.add(elementoActual2.getText());

                }
            }

        }

        return request;

    }

    public void guardarRegistroUsuario(User user) throws JDOMException, IOException {
        Element eUser = new Element("Usuario");
        eUser.setAttribute("user", user.getUser());

        Element nameE = new Element("name");
        nameE.addContent(user.getName());

        Element passE = new Element("password");
        passE.addContent(user.getPassword());

        Element postsE = new Element("Posts");
        postsE.addContent("");

        Element friendsE = new Element("Friends");
        friendsE.addContent("");

        Element requestE = new Element("Requests");
        requestE.addContent("");

        eUser.addContent(nameE);
        eUser.addContent(passE);
        eUser.addContent(postsE);
        eUser.addContent(friendsE);
        eUser.addContent(requestE);

        this.rootElement.addContent(eUser);
        guardarXML();
    }

    //metodo utilizado en logIn, valida que el usuario exista
    public boolean loginXML(String userS, String password) {
        List elementList = this.rootElement.getChildren();
        int aux = elementList.size();
        for (int i = 0; i < aux; i++) {
            Element eUsuario = (Element) elementList.get(i);
            if (eUsuario.getAttributeValue("user").equals(userS)
                    && eUsuario.getChild("password").getValue().equals(password)) {
                return true;
            }
        }
        return false;
    }

    //metodo usado en signUp, para que se ingresen distintos usuarios
    public boolean signUpXML(String userS) {
        List elementList = this.rootElement.getChildren();
        int aux = elementList.size();
        for (int i = 0; i < aux; i++) {
            Element eUsuario = (Element) elementList.get(i);
            if (eUsuario.getAttributeValue("user").equals(userS)) {
                return true;
            }
        }
        return false;
    }

    //se agrega Friends al XML
    public void addFriends(User user, String friend) {

        addFriends2(user, friend);
        addFriends2(buscarUser(friend), user.getUser());
    }

    private void addFriends2(User user, String friend) {
        try {
            File file = new File("usuarios.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            this.document = saxBuilder.build(file);
            this.rootElement = this.document.getRootElement();
            Element userE = searchUser(user);
            if (userE != null) {
                Element friendsE = searchUser(buscarUser(friend));
                if (userE != null) {

                    Element eFriends = userE.getChild("Friends");
                    Element eFriend = new Element("Friend");

                    eFriend.setText(buscarUser(friend).getUser());
                    eFriends.addContent(eFriend);
                    this.rootElement.getContent();
                    guardarXML();
                }
                this.rootElement.getContent();
                guardarXML();
            }

        } catch (JDOMException | IOException ex) {
            Logger.getLogger(UsuarioXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //se añade un post al XML
    public void addPost(String post, User user) {
        try {
            File file = new File("usuarios.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            this.document = saxBuilder.build(file);
            this.rootElement = this.document.getRootElement();
            Element userE = searchUser(user);
            if (userE != null) {
                Element ePosts = userE.getChild("Posts");

                Element ePost = new Element("Post");
                ePost.setText(post);

                ePosts.addContent(ePost);

                this.rootElement.getContent();
                guardarXML();
            }

        } catch (JDOMException | IOException ex) {
            Logger.getLogger(UsuarioXML.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void addRequest(String request, User user) {
        try {
            File file = new File("usuarios.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            this.document = saxBuilder.build(file);
            this.rootElement = this.document.getRootElement();
            Element userE = searchUser(user);
            if (userE != null) {
                Element friendsE = searchUser(buscarUser(request));
                if (userE != null) {

                    Element eFriends = userE.getChild("Requests");
                    Element eFriend = new Element("Request");

                    eFriend.setText(buscarUser(request).getUser());
                    eFriends.addContent(eFriend);
                    this.rootElement.getContent();
                    guardarXML();
                }
                this.rootElement.getContent();
                guardarXML();
            }

        } catch (JDOMException | IOException ex) {
            Logger.getLogger(UsuarioXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Element searchFriends(Friends friends) {
        List elementList = this.rootElement.getChildren();
        int aux = elementList.size();
        for (int i = 0; i < aux; i++) {
            Element eUsuario = (Element) elementList.get(i);
            if (eUsuario.getAttributeValue("user").equals(friends.getUsername())) {
                return eUsuario;
            }
        }
        return null;
    }

    public Element searchUser(User user) {
        List elementList = this.rootElement.getChildren();
        int aux = elementList.size();
        for (int i = 0; i < aux; i++) {
            Element eUsuario = (Element) elementList.get(i);
            if (eUsuario.getAttributeValue("user").equals(user.getUser())) {
                return eUsuario;
            }
        }
        return null;
    }

    public User buscarUser(String user) {
        List elementList = this.rootElement.getChildren();
        int aux = elementList.size();
        for (int i = 0; i < aux; i++) {
            System.out.println("i");
            Element eUsuario = (Element) elementList.get(i);
            if (eUsuario.getAttributeValue("user").equals(user)) {
                System.out.println("2.1");
                return new User(eUsuario.getAttributeValue("user"),
                        eUsuario.getChild("name").getValue(),
                        eUsuario.getChild("password").getValue());
            }
        }
        return null;
    }

    private void guardarArchivoXML(String nombreArchivo) throws JDOMException, IOException {
        this.ruta = nombreArchivo;
        File archivo = new File(this.ruta);
        if (archivo.exists()) {
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);
            this.document = saxBuilder.build(this.ruta);
            this.rootElement = this.document.getRootElement();
            XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
            xmlOutputter.output(this.document, new FileWriter("usuarios.xml"));
            System.out.println("creado");
        } else {
            Format.getPrettyFormat();
            rootElement = new Element("Usuarios");
            this.document = new Document(rootElement);
            guardarXML();
//            xmlOutputter.output(this.document, new PrintWriter(this.ruta));
            System.out.println("Archivo XML guardado exitosamente.");
        }
    }

    private void guardarXML() throws FileNotFoundException, IOException {

        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.output(this.document, new PrintWriter("usuarios.xml"));
    }

} //class
