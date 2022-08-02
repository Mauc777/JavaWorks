package Exemple004.version2;

import java.util.ArrayList;
import java.util.List;


// это старая версия в v1
// public class Repository {
// List<Content> ds;

    
    // Новая вепсия с ис-ием ОБОБЩЕННОГО ТИПА. В v2
    // public class Repository<T> {
    
    //Вот мы Наследуем Обобщенный тип T от типа - Content, 
    //То есть тип T должен быть в одной ИЕРАРХИИ типа Content,
    // При чем -->> находится ниже Типа Content!!
public class Repository <T extends Content>   {   
        
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n >> %s creeted\n", this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренирровки реализовать возможность работы с forech
    
    
}
