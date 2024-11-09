package com.library.entity;

public class User {
    private int userId;
    private String name;

    public User(int userId, String name){
        this.userId=userId;
        this.name=name;
    }

    public int getUserId() {
        return userId;
    }
    public String getname(){
        return name;
    }

    public void displayUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
