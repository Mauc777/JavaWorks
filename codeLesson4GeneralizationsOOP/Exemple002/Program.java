package Exemple002;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(12, "firstName", "lastName", 28, 2500);
        System.out.println(w.getId());

        // При использовании заранее написанного некоего класса с наперед
        // неизвестным типом <E> -- мы , если захотим создать некий ParametrizedWorker
        // мы просто при создании его в типе <E> укажем нужный для нас тип (в данном случае нужный тип для Id)
        // Вариант 1 
        ParametrizedWorker<Integer> w1 = new ParametrizedWorker<Integer>(
            1990,
            "sfsfsdf",
            "sssdsd",
            20,
            22);
        System.out.println(w1.getId());
            

        // пример Случайной Генерации Строки String
        String uid = UUID.randomUUID().toString(); 
        // Вариант с типом Id == String
        ParametrizedWorker<String> w2 = new ParametrizedWorker<String>(
            // 225, --> Вот так он не даст прописать!!!
            // "scdcsc",   только строчное Id!!!
            uid,
            "Vasya",
            "Petrov",
            19,
            2250);
        System.out.println(w2.getId());        
            
    }
    
}
