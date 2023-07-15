package me.ifmo.creatures;

import me.ifmo.interfaces.StayAble;

public record Dish(String name) implements StayAble {
    private final static int countOfPies = 10;

    public static int getCountOfPies() {
        return countOfPies;
    }

    @Override
    public String stay() {
        return " а на нем красовалось большое ";
    }
}
