package RobotCop;

public class Program {
    public static void main(String[] args) {

        //#region
        // Robot1 robot1 = new Robot1("ВАсЯ", 1);
        // System.out.printf("%s %d\n", robot1.name, robot1.level);
        //#endregion

        //#region
        // Robot2 robo2 = new Robot2("Pavel", 2);
        // System.out.printf("%s %d \n", robo2.getName(),
        //                                 robo2.getLevel());
        // robo2.powerOn();
        // robo2.work();
        // robo2.ppowerOff();
        //#endregion

        Robot3 r3 = new Robot3("6546456");
        r3.powerOn();
        System.out.println(r3);
    }
}
