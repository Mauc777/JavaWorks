import java.util.ArrayList;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
        
        AnimalComparator pcomp = new AnimalComparator();
        TreeSet<Animal> animalList = new TreeSet<Animal>(pcomp);
 
        // ArrayList<Animal> animalList = new ArrayList<>();       

        animalList.add(new Cat("Васька", "серый", 3));
        animalList.add(new Cat("Петька", "серо-белый", 7));
        animalList.add(new Cat("Бориска", "сизый", 1));
        animalList.add(new Dog("Мухтар", "черный", 22));
        animalList.add(new Dog("Дружок", "черно-серый", 15));
        animalList.add(new Dog("Арчи", "серо-бело-черный", 24));
        animalList.add(new Bird("Ара", "радужный", 2, "25cм крыло"));


        for (Animal animal : animalList ){
            System.out.println(animal);
        }



   
    }
            
}        

        
