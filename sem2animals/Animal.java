public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Умение у всех животных --> ходить
    public void walk() {
        System.out.println(name + " Ходит на лапах  - шустро");
    }

    // Данный метод уже АБСТРАКТНЫЙ т.к хочу на примере него показать и применить
    // возможности абстрактных методов
    public abstract void voice();

}
