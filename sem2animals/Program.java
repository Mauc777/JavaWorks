
public class Program {

    public static void main(String[] args) {
        new Human(new Dog("Джаспер", "серый", 12)).call();
        new Human(new Cat("Эмми", "Пепельный", 8, new Meow())).call();
        }
    }


