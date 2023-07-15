package me.ifmo.creatures;

import me.ifmo.interfaces.LookAble;

public record Pies(String name) implements LookAble {

    @Override
    public String look() {
        return ", и вид у них был такой аппетитный, что у ";
    }
}
