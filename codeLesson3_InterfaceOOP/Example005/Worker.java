package Example005;


import java.util.Iterator;

// public class Worker implements Iterator<String> {
public class Worker implements Comparable<Worker> {    
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.index = 0;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    int index;

    // @Override
    // public boolean hasNext() {
    //     return index++ < 4;
    // }

    // @Override
    // public String next() {
    //     switch (index) {
    //         case 1:
    //             // return firstName;
    //             return String.format("firstName: %s", firstName);
    //         case 2:
    //             // return lastName;
    //             return String.format("lastName: %s", lastName);
    //         case 3:
    //             // return age;
    //             // return firstName;
    //             return String.format("age: %d", age);
    //         default:
    //             // return salary;
    //             return String.format("salary: %d", salary);
    //     }
    // }

    @Override
    public String toString() {
        
        // return String.format("firstName\n: %s", this.firstName,
        //                     "lastName: %s\n", this.lastName,
        //                     "age: %d\n", this.age,
        //                     "salary: %d\n", this.salary);
        return String.format("\n %s %d %d", fullName(),age,salary);
      
        
    }


    // Переопределяем что значит 
    // 1 Воркер больше\меньше второго Воркера
    // Первый способ -заводской
    // @Override
    // public int compareTo(Worker o) {
    //     if(this.age > o.age)
    //     return 1;
    //    else if (this.age < o.age)
    //     return -1;
    //     else 
    //         return 0;
    // }  

    // второй способ 
    @Override
    public int compareTo(Worker o) {
        // return Integer.compare(this.age,o.age);
        return Integer.compare(this.salary,o.salary);

    }
       
}  

         

    

