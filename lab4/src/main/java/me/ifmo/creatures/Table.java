package me.ifmo.creatures;

import me.ifmo.interfaces.StayAble;

public record Table(String name) implements StayAble {

    @Override
    public String stay() {
        return "А в самом центре судебного зала стоял ";
    }
}
