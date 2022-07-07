public class Cat extends Animal {

    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void walk() {
        System.out.println(name + " Очень КЛАССНО ходит на лапках");
    }

    @Override
    public void voice() {
        System.out.println(name + "Мявуууу");
    }

}
