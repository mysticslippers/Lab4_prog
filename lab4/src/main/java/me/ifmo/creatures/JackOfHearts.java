package me.ifmo.creatures;

import me.ifmo.interfaces.StayAble;

public class JackOfHearts implements StayAble{
    private final String name;

    public JackOfHearts(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public class FirstSecurityGuard implements StayAble{
        private final String name;

        public FirstSecurityGuard(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        @Override
        public String stay(){
            return " справа, ";
        }
    }

    public static class SecondSecurityGuard{
        private static final String name = "другой";

        public static String getName() {
            return name;
        }

        public static String protect(){
            return " - слева - ";
        }
    }

    @Override
    public String stay(){
        return "Перед судейским троном стоял в цепях под охраной двух солдат - ";
    }

    @Override
    public String toString(){
        return "JackOfHearts: " + getName();
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
