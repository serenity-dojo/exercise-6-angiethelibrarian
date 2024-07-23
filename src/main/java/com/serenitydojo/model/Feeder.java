package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if (isPremium) {
            if(animal.equals("Cat")) {
                return "Salmon";
            } else if (animal.equals("Dog")) {
                return "Deluxe Dog Food";
            } else if (animal.equals("Hamster")) {
                return "Lettuce";
            }
        } else {
            if(animal.equals("Cat")) {
                return "Tuna";
            } else if (animal.equals("Dog")) {
                return "Dog Food";
            } else if (animal.equals("Hamster")) {
                return "Cabbage";
            }
        }
        return "Food";
    }

}

