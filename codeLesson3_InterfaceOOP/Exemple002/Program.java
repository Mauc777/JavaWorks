package Exemple002;

import java.util.Iterator;

public class Program {

    public static void main(String[] args) {
        
    
    Worker worker = new Worker("Имя", "Фамилия", 28, 4465);
    // Приводим woker напрямую к ИТЕРАТОРУ
    Iterator<String> components = worker;   
        
    while(components.hasNext()){
        System.out.println(worker.next());
    }

    }
    
}
