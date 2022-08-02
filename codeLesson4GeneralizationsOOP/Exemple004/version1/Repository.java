package Exemple004.version1;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Content> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n >> %s creeted\n", this.name);
    }

    public void add(Content content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public Content get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренирровки реализовать возможность работы с forech
    
    
}
