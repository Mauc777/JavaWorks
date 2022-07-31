package PhoneBook.Core.Models;
// модель не в контексте mvp патерна, а модели данных!

// т е , имеем модель данных - Contact

import java.time.LocalDate;

public class Contact implements Comparable<Contact> {
    public LocalDate date;
    public String firstName;
    public String lastName;
    public String company;
    public String phone;
    // public Email email;
    // public String email; ДОПИСАТЬ, Во всяком случае попробывать!!
    public String description;

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        // Попробовывть реализацию с большим количеством аргументов
    }

    @Override
    public int compareTo(Contact o) {
        // ?? ...
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact) obj;
        return this.firstName == t.firstName
                && this.lastName == t.lastName;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
