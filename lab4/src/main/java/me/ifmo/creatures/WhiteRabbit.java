package me.ifmo.creatures;

import me.ifmo.abstractions.Animal;
import me.ifmo.interfaces.ExistAble;

public class WhiteRabbit extends Animal implements ExistAble{
    public WhiteRabbit(String name, String color){
        super(name, color);
    }

    @Override
    public String changeFur(){
        while(getColor().equals("Коричневый")){
            int randomNumber = (int)(Math.random() * 12) + 1;
            if(randomNumber == 1 || randomNumber == 2 || randomNumber == 12){
                setName("Кролик");
                setColor("Белый");
            }
            else{
                setName("Не кролик");
                setColor("Коричневый");
            }
        }
        return getColor();
    }

    @Override
    public String exist(){
        return " находился ";
    }

    @Override
    public String toString(){
        return "WhiteRabbit: " + getName() + getColor();
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
