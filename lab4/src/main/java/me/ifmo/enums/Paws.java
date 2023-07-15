package me.ifmo.enums;

import me.ifmo.interfaces.HoldAble;

public enum Paws implements HoldAble{
    Right("в одной лапке "){
        @Override
        public String hold() {
            return "с трубой ";
        }
    },
    Left("в другой") {
        @Override
        public String hold() {
            return "и пергаментным свитком ";
        }
    };
    private final String name;
    Paws(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
