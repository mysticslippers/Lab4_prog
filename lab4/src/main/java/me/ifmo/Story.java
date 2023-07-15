package me.ifmo;

import me.ifmo.creatures.*;
import me.ifmo.enums.Paws;

public class Story {
    public static void main(String[] args) {
        King king = new King("Король", false, 100);
        WhiteRabbit whiteRabbit = new WhiteRabbit("Кролик", "Коричневый");
        Alice alice = new Alice("Алиса", true, 100);
        Table table = new Table("стол");
        Dish dish = new Dish("блюдо");
        Pies pies = new Pies("пирожки");

        king.waste();
        alice.waste();

        System.out.println(king.exist() + king.getName().replace("ь", "я") + whiteRabbit.exist() + whiteRabbit.changeFur() + " " + whiteRabbit.getName() + ", " + Paws.Right.hold() + Paws.Right.getName() + Paws.Left.hold() + Paws.Left.getName() + ".");
        System.out.println(table.stay() + table.name() + "," + dish.stay() + dish.name() + " с " + pies.name().replace("ки", "ками") + pies.look() + alice.getName().replace("а", "ы") + alice.getCondition());
        System.out.println(alice.dream());
    }
}