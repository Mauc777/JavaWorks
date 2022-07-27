package PhoneBook.Core.MVP;

import PhoneBook.Core.Models.Contact;

// Связывает Модель с конкретным Представлением
public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    // Логика загрузки данных
    public void loadFromFile() {
        model.load();

        if (model.currentBook().count() > 0) {
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
        }
    }

    public void add() {

        model.currentBook().add(
                new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));

    }

    // блок удаления контакта
    public void remove(){
    Contact contact = new Contact(view.getFirstName(), view.getLastName(),view.getDescription());
    model.currentBook().remove(contact);

    if(model.currentBook().count() <1 ){

        model.setCurrentIndex(-1);

        view.setFirstName( " ");
        view.setLastName(" ");
        view.setDescription( " ");
    }else{
        model.setCurrentIndex(model.getCurrentIndex()-1);
        if(model.getCurrentIndex()<0)
            model.setCurrentIndex(0);

        Contact temp = model.currentContact();
        view.setFirstName(temp.firstName);
        view.setLastName(temp.lastName);
        view.setDescription(temp.description);    






    }

    }

    public void safeToFile(){
        model.save();
    }

    // Метод переключения к след-ей записи
    public void next(){
        if(model.currentBook().count()>0 ){
            if(model.getCurrentIndex()+1 < model.currentBook().count()){
                model.setCurrentIndex(model.getCurrentIndex()+1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
            }
        }
    }

    // Переключение к предыдущ записи
    public void prev(){
        if(model.currentBook().count() > 0){
            if(model.getCurrentIndex()-1 > -1){
                model.setCurrentIndex(model.getCurrentIndex()-1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);
            
            }
        }
    }

}
