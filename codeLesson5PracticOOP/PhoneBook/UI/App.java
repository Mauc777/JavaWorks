package PhoneBook.UI;

import java.util.Scanner;
import PhoneBook.Config;
import PhoneBook.Core.MVP.Presenter;
import PhoneBook.Core.MVP.*;

public class App {

    public static void ButtonClick() {
        System.out.print("\033[H\033[J"); // ru.stackoverflow.com/question
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.loadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("1 - add  | 2 - delete");
                System.out.println("3 - prev | 4 - next");
                System.out.println("5 - save ");
                String key = in.next();

                // Данная строка позволяет очистить консоль
                System.out.print("\033[H\033[J");

                switch (key) {
                    case "1":
                        presenter.add();
                        ;
                        break;  
                    case "2":
                        presenter.remove();
                        break;
                    case "3":
                        presenter.prev();
                        break;
                    case "4":
                        presenter.next();
                        break;
                    case "5":
                        presenter.safeToFile();
                        break;     
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }

}
