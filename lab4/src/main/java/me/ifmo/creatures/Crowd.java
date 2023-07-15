package me.ifmo.creatures;

import me.ifmo.interfaces.ExistAble;

public class Crowd implements ExistAble{

    class Birdies{
        private final String name;

        public Birdies(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    class LittleAnimals{
        private final String name;

        public LittleAnimals(String name){
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    class Cards{
        private final String name;

        public Cards(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    Birdies birdies = new Birdies("пичужки");
    LittleAnimals littleAnimals = new LittleAnimals("зверюшки всех пород");
    Cards cards = new Cards("карты всех мастей");

    @Override
    public String exist(){
        return "а кругом собралась огромная толпа: " + birdies.getName() + ", " + littleAnimals.getName() + ", " + "не говоря уже о " + cards.getName().replace("карты", "картах") + ".";
    }

    @Override
    public String toString(){
        return "Crowd: " + birdies.getName() + littleAnimals.getName() + cards.getName();
    }

    @Override
    public int hashCode(){
        return (birdies.getName() == null) ? 0 : birdies.getName().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof String comparableString) {
            int length = littleAnimals.getName().length();
            if (length == comparableString.length()) {
                int i = 0;
                while (length-- != 0) {
                    if (littleAnimals.getName().charAt(i) != comparableString.charAt(i)) {
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
