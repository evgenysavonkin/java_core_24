package org.evgenysav.module8.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal[] herd = new Animal[7];
        herd[0] = new Horse("Horse 1", 4, false);
        herd[1] = new Horse("Horse 2", 4, false);
        herd[2] = new Kangaroo("Kangaroo 1", 4, true);
        herd[3] = new Kangaroo("Kangaroo 2", 4, true);
        herd[4] = new Dragonfly("Dragonfly 1", 6, true);
        herd[5] = new Dragonfly("Dragonfly 2", 6, true);
        herd[6] = new Animal() {
        };

        Horse horse = new Horse("Horse 3", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo 3", 4, true);
        Dragonfly dragonfly = new Dragonfly("Dragonfly 3", 4, true);
        makeAnimalsDoActions(herd, horse, kangaroo, dragonfly);
    }

    private static void makeAnimalsDoActions(Animal[] animals, Animal... animalsArr) {
        List<Animal> list = new ArrayList<>(List.of(animals));
        list.addAll(Arrays.asList(animalsArr));
        list.forEach(Animal::voice);
        System.out.println();
        list.forEach(Animal::move);
        System.out.println();
        list.forEach(Animal::isHungry);
    }
}
