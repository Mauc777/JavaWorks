package RobotCop;

public class Robot1 {
    /**Уровень робота */
    public int level;

    /*Имя робота */
    public String name;

    /*Создание робота 
     * @param name 
     * 
    */
    
    public Robot1(String name, int level){
        this.name = name;
        this.level = level;
    }

    /*Загрузка BIOS */
    public void StartBIOS(){
        System.out.println("Старт БИОС");
    }

    /*Загрузка OS */
    public void StartOS(){
        System.out.println("Старт ОС");
    }

    /* Приветствие */
    public void sayHi(){
        System.out.println("Хэлло ");
    }

    /*выгрузка БИОС */
    public void stopBIOS(){
        System.out.println("Стоп Биос");
    }

      /*выгрузка ОС */
      public void stopOS(){
        System.out.println("Стоп Биос");
    }

    /* ПРОЩАНИЕ */
    public void sayBy(){
        System.out.println("ПОКА-- ПОКА");
    }

    /*РАБОТА */
    public void work(){
        System.out.println("Working");
    }
    
}
