package RobotCop;

import java.util.ArrayList;

public class Robot3 {

    // Cостояние = State
    enum State{
        On, Off
    }

    // ДЕфолт индекс
    private static int defaultIndex;
    // Коллекция ИМЕН
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

     /**Уровень робота */
     private int level;

     /*Имя робота */
     private String name;

     private State state;

    

    //  Конструктор Робота3
    private Robot3(String name, int level){
    //#region
    //private Robot3(String name, int level)   ====  если захотим скрыть от поль-ля основной конструктор
    //#endregion

        if((name.isEmpty()                                       //если имя Робота будет Пустым
                || Character.isDigit(name.charAt(0)))     // или первый символ буде яв-ся цифрой
                || Robot3.names.indexOf(name) != -1)             // или такое имя было задано РАНЕЕ
        {
            this.name = String.format("DefaultName_%d", defaultIndex++ );   // то создаем Дефолтное ИМя 
        } else {
            this.name = name;   // Если пред условия не выполняются - то берем имя которое подсунул поль-ль и исп его 
        }

        Robot3.names.add(this.name);  // Добавление имени в Коллекцию
        this.level= level;
        this.state = State.Off;  // инициалтзация начального состояния
        
    }

    //  Констру-тор с одним параметром 
    public Robot3(String name){
        // вызывает контср с 2мя параметрами
        this(name,1);
     }

    //  КОнстр без параметр вызфвает конструкт с 1 параметр
     public Robot3(){
        // передавая в качестве арг пустую строку ("")
        this("");
     }


     public void power(){
        if(this.state == State.Off){
            this.powerOn();
            this.state = State.On;
        }else {
            this.ppowerOff();
            this.state = State.Off;
        }
        System.out.println();
     }




     /*Метод включения робота */
    public void powerOn(){
        this.StartBIOS();
        this.StartOS();
        this.sayHi();
    }

     /*Метод вЫключения робота */
    public void ppowerOff(){
        this.sayBy();
        this.stopOS();
        this.stopBIOS();
    }

    /*Загрузка BIOS */
    public void StartBIOS(){
        System.out.println("Старт БИОС");
    }

    /*Загрузка OS */
    private void StartOS(){
        System.out.println("Старт ОС");
    }

    /* Приветствие */
    private void sayHi(){
        System.out.println("Хэлло ");
    }

    /*выгрузка БИОС */
    private void stopBIOS(){
        System.out.println("Стоп Биос..............");
    }

      /*выгрузка ОС */
    private void stopOS(){
        System.out.println("Стоп OS...........");
    }

    /* ПРОЩАНИЕ */
    private void sayBy(){
        System.out.println("ПОКА-- ПОКА..............");
    }

    /*РАБОТА */
    public void work(){
        if (this.state == State.On){
            System.out.println("Working......");
        }
    }

    @Override
    public String toString(){
        return String.format("%s %d\n",this.name, this.level);
    }
}
