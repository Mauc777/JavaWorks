package RobotCop;

public class Robot2 {
    /**Уровень робота */
    private int level;

    /*Имя робота */
    private String name;


    public Robot2(String name,int level) {
        this.name = name;
        this.level = level;
        
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
        System.out.println("Working");
    }



    
    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    
}
