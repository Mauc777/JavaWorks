package Exemple002;

// В качестве ОБОБЩЕНИЯ будет использоваться какой-то наперед неизвестный ТИП типа <E> иначе -->> ВэйсХолдер
public class ParametrizedWorker<E> {
    // Обрати внимание на тип <E> всместо int в классе Worker!!!
    private E id;

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public ParametrizedWorker(E id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public E getId() {
        return id;
    }
}
