package Exemple003Drink;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage
        // implements Iterator<Ingredient> {
        implements Iterable<Ingredient> {
    List<Ingredient> components;
    int index;

    // Конструктор
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    // метод добавл ингредиента
    public void addComponent(Ingredient component) {
        // что если такой при добавлении ингред - такой
        // такой ингредиент уже существует
        if (!(components.indexOf(component) != -1))
            components.add(component);

        // }

        // @Override
        // public boolean hasNext() {
        // return index < components.size();
        // }

        // @Override
        // public Ingredient next() {
        // return components.get(index++);
        // }

    }
}
