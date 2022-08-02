package Exemple003Drink;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        

        // Созд напиток типа кофе
        Beverage latte = new Coffee();

        Coffee latte1 = new Coffee();
         // Добавляем одинаковые ингредиенты
        latte1.addComponent(new Water("Вода"));
        latte1.addComponent(new Water("Вода"));
        latte1.addComponent(new Water("Вода"));
        for (var ingredient : latte1) {
            System.out.println(ingredient);
        }
        
        
        
        // Добавляем разные ингредиенты
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зерна"));
        latte.addComponent(new Milk("Молоко"));
    

        // Проходимся с помощью итератора по объекту latte 
        // Iterator<Ingredient> iter = lat
        

        // Random r = new Random();
        // List<Integer> numbers = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        //     numbers.add(r.nextInt(1,20));
        // }
        // System.out.printf("до: %s\n", numbers);
        // Collections.sort(numbers);
        // System.out.println(numbers);System.out.printf(" после:  %s\n", numbers);
    }

      
}
    
// }
