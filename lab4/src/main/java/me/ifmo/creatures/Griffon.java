package me.ifmo.creatures;

import me.ifmo.abstractions.Bird;

public class Griffon extends Bird{

    public Griffon(String name, String colorOfFeathers, int size){
        super(name, colorOfFeathers, size);
    }

    @Override
    public String fly(){
        if(this.getSize() <= 50 && this.getColorOfFeathers() == null){
            return "Не высоко";
        }
        return null;
    }

    @Override
    public String toString(){
        return "Griffon: " + getName() + getColorOfFeathers() + getSize();
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
