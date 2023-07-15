package me.ifmo.abstractions;

public abstract class Bird{
    private final String name;
    private final String colorOfFeathers;
    private final int size;
    public Bird(String name, String colorOfFeathers, int size){
        this.name = name;
        this.colorOfFeathers = colorOfFeathers;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getColorOfFeathers() {
        return colorOfFeathers;
    }

    public int getSize() {
        return size;
    }

    public abstract String fly();
}
