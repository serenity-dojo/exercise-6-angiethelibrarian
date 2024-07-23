package com.serenitydojo;

public class Hamster extends Pet{

    private String favoriteGame;
    private int age;

    public static final String HAMSTER_NOISE = "Squeak";

    public static String usualGame() {return "Wheel";}

    public Hamster(String name, String favoriteGame, int age) {
        super(name);
        this.favoriteGame = favoriteGame;
        this.age = age;
    }


    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {System.out.println(HAMSTER_NOISE);}

    public void feed(String food) {System.out.println(getName() + "eats some" + food);}

    public void groom() {
        lickPaw();
        cleanFur();
    }

    private void cleanFur() {System.out.println(getName() + "cleans his fur");}

    private void lickPaw() {System.out.println(getName() + "licks his paws");}

    @Override
    public String play() {
        return "runs in wheel";
    }
}