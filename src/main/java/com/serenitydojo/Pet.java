package com.serenitydojo;

public class Pet {
    private String name;
    public Pet(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String play() {
        return null;
    }


    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}