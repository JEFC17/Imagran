/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class User {
    
    private String name;
    private ArrayList<Post> post;
    private String user;
    private String password;
    
    public User(String user, String name, String password) {
        this.name = name;
        this.user = user;
        this.password = password;
        this.post = new ArrayList<>();
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

    public ArrayList<Post> getPost() {
        return post;
    }

    public void setPost(Post e) {
        this.post.add(e);
    }
    
    
    
}
