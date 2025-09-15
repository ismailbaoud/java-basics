package com.example.java.auth;

import java.util.ArrayList;

public class Register {

    private ArrayList<User> users = new ArrayList<>();

    public void Register(String username, String email , String password) {
        boolean isUserExist = false;
        for(User user : users) {
            System.out.print("user" + user);
            if(user.getEmail() == email) {
                isUserExist = true;
            }
        }
        if(isUserExist){
            System.out.print("this user email is already exist !");
            return;
        }else {
            User newUser = new User(username, email, password);
            users.add(newUser);
            System.out.println("Registration successful for user: " + username);
            Welcome.WelcomeMessage(username);
        }

    }
}