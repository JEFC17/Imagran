/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import Logic.CircularDoublyList;
import Logic.LinkedQueue;
import Logic.LinkedStack;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class User {

    private String name;
    private LinkedStack post;
    private String user;
    private String password;
    private CircularDoublyList friends;
    private LinkedQueue request;
    private LinkedQueue suggestion;

    @Override
    public String toString() {
        return "User{" + "post=" + post.toString() + ", user=" + user + '}';
    }

    public LinkedStack recuperarStacks() {
        LinkedStack linkedStack = new LinkedStack();
        for (int i = 0; i < friends.getSize() - 1; i++) {
            User u = (User) friends.getByPosition(i);
            LinkedStack aux = new LinkedStack();
            for (int j = 0; j < u.getPost().getSize(); j++) {
                linkedStack.push(u.getPost().top());
                aux.push(u.getPost().top());
                u.getPost().pop();
            }
            u.setPost(aux);
        }
        return null;
    }

    public User(String user, CircularDoublyList friends) {
        this.user = user;
        this.friends = friends;
        this.post = new LinkedStack();
        this.request = new LinkedQueue();
        this.suggestion = new LinkedQueue();
    }

    
    
    public User() {
        this.post = new LinkedStack();
        this.friends = new CircularDoublyList();
        this.request = new LinkedQueue();
        this.suggestion = new LinkedQueue();
    }

    public User(String user, LinkedStack post) {
        this.post = post;
        this.user = user;
        this.post = new LinkedStack();
        this.friends = new CircularDoublyList();
        this.request = new LinkedQueue();
        this.suggestion = new LinkedQueue();

    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
        this.post = new LinkedStack();
        this.friends = new CircularDoublyList();
        this.request = new LinkedQueue();
        this.suggestion = new LinkedQueue();

    }

    public User(String user, String name, String password) {
        this.name = name;
        this.user = user;
        this.password = password;
        this.friends = new CircularDoublyList();
        this.post = new LinkedStack();
        this.request = new LinkedQueue();
        this.suggestion = new LinkedQueue();

    }

    public LinkedQueue getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(LinkedQueue suggestion) {
        this.suggestion = suggestion;
    }

    
    
    public LinkedQueue getRequest() {
        return request;
    }

    public void setRequest(LinkedQueue request) {
        this.request = request;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ArrayList<Post> getPost() {
//        return post;
//    }
//
//    public void setPost(Post e) {
//        this.post.add(e);
//    }
    public LinkedStack getPost() {
        return post;
    }

    public void setPost(LinkedStack post) {
        this.post = post;
    }

    public CircularDoublyList getFriends() {
        return friends;
    }

    public void setFriends(CircularDoublyList friends) {
        this.friends = friends;
    }

    public void addPosts(Post post) {
        this.post.push(post);
    }

}
