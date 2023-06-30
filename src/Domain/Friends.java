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
public class Friends {
    
    private ArrayList<User> Friends;
    private String username;

    public Friends(String username) {
        this.username = username;
        this.Friends = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
  
    public ArrayList<User> getFriends() {
        Friends.add(new User());
        
        
        return Friends;
    }

    public void setFriends(ArrayList<User> Friends) {
        this.Friends = Friends;
    }

    
    
    
    
}
