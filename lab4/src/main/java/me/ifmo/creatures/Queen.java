package me.ifmo.creatures;

import me.ifmo.abstractions.Human;
import me.ifmo.interfaces.SitAble;

public class Queen extends Human{
    public Queen(String name, boolean gender, int appetite){
        super(name, gender, appetite);
    }

    @Override
    public void waste(){
        this.setAppetite(0);
    }

    public void anonymousSitAble(SitAble instance){
        instance.sit();
    }

    public String sit(){
        anonymousSitAble(this::waste);
        return " уже сидели на троне, ";
    }

    @Override
    public String toString(){
        return "Queen: " + getName() + isGender();
    }

    @Override
    public int hashCode(){
        return (getName() == null) ? 0 : getName().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof String comparableString) {
            int length = getName().length();
            if (length == comparableString.length()) {
                int i = 0;
                while (length-- != 0) {
                    if (getName().charAt(i) != comparableString.charAt(i)) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }
}
