public abstract class Animal {
    protected String name;


    protected String color;
    protected int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Метод добавления нового animal -- Доделать!!!
    // public void animalAdd(Animal... animal){
    //     Animal.add(animal);
    //     System.out.println("sdvs");
    // }

    // Умение у всех животных --> ходить ПО СВОЕМУ , сделаем метод абстрактным
    public abstract void walk();

    // Данный метод  АБСТРАКТНЫЙ 
    public abstract void voice();

    public String getName() {
        return name;
    }

}
