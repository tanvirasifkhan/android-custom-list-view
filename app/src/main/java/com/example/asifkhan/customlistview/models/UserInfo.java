package com.example.asifkhan.customlistview.models;

public class UserInfo {
    private String name,profession;
    private int photo;

    public UserInfo(){}

    public UserInfo(String name, String profession, int photo) {
        this.name = name;
        this.profession = profession;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getPhoto() {
        return photo;
    }
}
