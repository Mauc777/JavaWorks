package Exemple002;

public class MultiParametrized<E1, E2, E3> {
    public E1 value1;
    public E2 value2;
    public E3 value3;

    // Используем значения наперед неизвестных типов
    // где в value1,2,3 --> мы ложим
    public MultiParametrized(E1 e1, E2 e2, E3 e3) {
        this.value1 = e1;
        // мы не можем в value1 =(положить)= e2 ,так как у нас не обозначено что E1 и E2 являются ТИПАМИ одной ИерархиИ!
        // value1 = e2  нельзя-- описание выще
        this.value2 = e2;
        this.value3 = e3;
    }

    @Override
    public String toString() {
        return String.format("E1 type: %s E2 type: %s  E3 type: %s", 
            value1.getClass().getSimpleName(),
            value2.getClass().getSimpleName(),
            value3.getClass().getSimpleName()

        
        );
    }

}
