package me.ifmo.abstractions;

public abstract class Animal{
    private String name;
    private String color;

    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public abstract String changeFur();
}
