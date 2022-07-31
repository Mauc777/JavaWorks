package calcProst;

public class Program {
    public static void main(String[] args) {

        var m = new SumModel();
        var v = new View();
        // все переменные выше можно не создавать , а передать вот такую конструкцию ниже
        // Presenter p = new Presenter(new SumModel(), new View());
        Presenter p = new Presenter(m,v);
        p.buttonClick();
    }
    
}
