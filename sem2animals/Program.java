public class Program {

    public static void main(String[] args) {

        Bird bird = new Bird("Ара", "разноцветный", 5, "85cm");
        Animal dog = new Dog("Мавр", "Белый", 2);
        Animal cat = new Cat("Джони", "Пепельный", 4);

        // System.out.println(cat);

        Animal[] zoo = { dog, bird, cat };
        {
            for (Animal animal : zoo) {
                if (animal == cat) {
                    cat.voice();
                }
            }

        }

    }
}

