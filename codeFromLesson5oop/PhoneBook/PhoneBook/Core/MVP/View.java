package PhoneBook.Core.MVP;


public interface View {
    String getFirstName();
    void setFirstName(String value);

    String getLastName();
    void setLastName(String value);

    String getDescription();
    void setDescription(String value);
    
    
    //Прит добавлении полей в PhoneBook() данный View должен будет измениться, 
    //  должен появить новый интерфейс унаследованный от данного View 
    // в котором будут описаны доп поля
    
}
