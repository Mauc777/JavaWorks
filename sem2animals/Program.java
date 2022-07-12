import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Program {

    public static void main(String[] args) {

        ArrayList<Animal> animalList = new ArrayList<>();       

        animalList.add(new Cat("111", "aaa", 19));
        animalList.add(new Cat("222", "bbb", 20));
        animalList.add(new Cat("333", "ccc", 21));
        animalList.add(new Dog("444", "ddd", 22));
        animalList.add(new Dog("555", "eee", 23));
        animalList.add(new Dog("666", "fff", 24));
        animalList.add(new Bird("777", "gggg", 25, "25cv крыло"));


        for (Animal animal : animalList ){
            System.out.println(animal);
        }
   
    }
            
}        

        



//         //Вот тк не работает вызов new GafGaf и метод gaf()
//         new Human(new Dog("Джаспер", "черный", 12, new GafGaf())).call(); 
//         new Human(new Cat("Кэт", "Пепельный", 8, new newMeow())).call();
        
//         new Human(new Bird("Яшка", "Красивы", 2, "крылья 15см",new Tweet())).call();

//         // Dog dag = new Dog("Арчи", "серо-белый", 1, new GafGaf());
//         // dag.voice(); // Вот так работает  вызов именно метода gaf()  класса GafGaf()
//         // new GafGaf().gaf();
//     }



// }    


