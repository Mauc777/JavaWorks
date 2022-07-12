
public class Program {

    public static void main(String[] args) {
        //Вот тк не работает вызов new GafGaf и метод gaf()
        new Human(new Dog("Джаспер", "черный", 12, new GafGaf())).call(); 
        new Human(new Cat("Кэт", "Пепельный", 8, new newMeow())).call();
        
        new Human(new Bird("Яшка", "Красивы", 2, "крылья 15см",new Tweet())).call();

        // Dog dag = new Dog("Арчи", "серо-белый", 1, new GafGaf());
        // dag.voice(); // Вот так работает  вызов именно метода gaf()  класса GafGaf()
        // new GafGaf().gaf();
    }



}    


