package Exemple003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {
    public static void main(String[] args) {
        
        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        
        // Methods.getElementFromUCollection(data, 1);
        Integer t = Methods.getElementFromUCollection(data, 1);
        System.out.println(t);
    }
    
}
