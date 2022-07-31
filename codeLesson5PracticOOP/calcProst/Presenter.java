package calcProst;

public class Presenter {
    // Здесь работа происх на абстракт уровне
    View view;
    SumModel sumMod;
    Model model;

    // Здесь же в конструкт принимаем уже конкретные модели и вью
    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    // Кнопка запуска нашего приложения
    public void buttonClick() {
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
