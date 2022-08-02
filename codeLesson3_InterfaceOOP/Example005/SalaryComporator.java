package Example005;

import java.util.Comparator;

// Описываем отдельную компоненту отвечающую 
// за упорядочивание Worker-ов
// и описываем что значит 1воркер больше другого, 
// то есть по каким кретериям один Воркер больше\меньше 
// Второго Воркера
public class SalaryComporator implements Comparator<Worker> {

    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.salary, o2.salary);
    }

}
