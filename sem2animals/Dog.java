public class Dog extends Animal {

    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public void walk() {
        System.out.println(name + " Ходит на лапах, туда сюда обратно! ");
    }
    
    @Override
    public void voice() {
        voiceDogs();;
    }


    void voiceDogs(){
        System.out.println(name + " Гаф -Маф "+ age + " лет");
    }

    
}

