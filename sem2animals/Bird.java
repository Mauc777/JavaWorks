public class Bird extends Animal {
    // имеет Крылья
    String wings;

    Bird(String name, String color, int age, String wings) {
        super(name, color, age);
        this.wings = wings;
    }

    @Override
    public void voice() {
        System.out.println(name + " Чык -чырык )) ");
    }

    public void walk() {
        System.out.println(name + " изредка ходит на ножках ");
    }
}
