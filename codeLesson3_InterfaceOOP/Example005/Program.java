package Example005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import Example005.SalaryComporator;

public class Program {
    public static void main(String[] args) {
        Random r = new Random();

        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя" + i, "Фамилия "+ i, r.nextInt(18,25), r.nextInt(1000)));
        }
        System.out.println(db);

        // // Работа через отдельно описанную ком-ту сортировки
        // db.sort(new SalaryComporator());

        // Сравнение через ЛЯМБДА-ВЫРАЖЕНИЕ
        db.sort((w1, w2) -> Integer.compare(w1.salary, w2.salary));
        // db.sort((w1, w2) -> Integer.compare(w1.age, w2.age));

        // Collections.sort(db);;
        // Array.sort(...);

        
        
        

    
    

    }
    
}
