package me.ifmo.creatures;

import me.ifmo.abstractions.Human;
import me.ifmo.interfaces.ExistAble;

public class King extends Human implements ExistAble{
    public King(String name, boolean gender, int appetite){
        super(name, gender, appetite);
    }

    @Override
    public String exist(){
        return "По правую руку от ";
    }

    @Override
    public void waste(){
        this.setAppetite(0);
    }

    @Override
    public String toString(){
        return "King: " + getName() + isGender();
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
