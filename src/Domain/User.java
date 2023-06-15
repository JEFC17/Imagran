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
    
    public User(String name) {
        this.name = name;
        this.post = new ArrayList<>();
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
