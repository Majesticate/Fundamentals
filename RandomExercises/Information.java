package com.company;

public class Information {
    private String name;
    private int citizen;
    private int gold;


    public Information(String name, int gold, int citizen) {
        this.name = name;
        this.gold = gold;
        this.citizen = citizen;
    }

    public Information() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setCitizen(int citizen) {
        this.citizen = citizen;
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public int getCitizen() {
        return citizen;
    }
}
