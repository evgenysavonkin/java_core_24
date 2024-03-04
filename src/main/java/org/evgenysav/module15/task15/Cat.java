package org.evgenysav.module15.task15;

public class Cat extends Animal {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                '}';
    }
}
