package calcProst;

import java.util.Scanner;

public class View {
    // Считывает данные
    Scanner in = new Scanner(System.in);

    // Условный getValue()
    public int getValue(String title){
        System.out.printf("%s", title);
        return in.nextInt();
    }
    
    // Печать данных на экран
    public void print(int data, String title){
        System.out.printf("%s %d\n", title, data);
    }
}
