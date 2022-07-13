
public abstract class Animal  {
    protected String name;
    protected String color;
    protected int age;

  
    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Умение у всех животных --> ходить ПО СВОЕМУ , сделаем метод абстрактным
    public abstract void walk();

    public void voice() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal [name = " + getName()
                + ", age = " + getAge()
                + ", color = " + getColor() + "]";
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

}
