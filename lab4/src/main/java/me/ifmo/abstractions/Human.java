package me.ifmo.abstractions;

public abstract class Human{
    private String name;
    private int appetite;
    private boolean gender;

    public Human(String name, boolean gender, int appetite){
        this.name = name;
        this.gender = gender;
        this.appetite = appetite;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAppetite(int appetite){
        this.appetite = appetite;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public int getAppetite(){
        return this.appetite;
    }

    public boolean isGender(){
        return this.gender;
    }

    public abstract void waste();
}

