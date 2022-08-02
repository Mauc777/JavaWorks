package Example001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(12345);
        nums.add(1234567);
        // Использование Iterator, т е мы превращаем
        // объект в итерируемый объект
        // Исп Итератор и приводим к нужному нам ТИПУ
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Worker worker = new Worker("Имя", "Фамилия", 28, 4465);
        // // Мы не можем исп iterator т к он у нас не реализован
        // Iterator<Object> components = worker.iterator();
        // }

    }
}
