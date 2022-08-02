package Exemple003Drink;

public abstract class Ingredient {
    public String brand;

    Ingredient(String brand){
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
    
    // Переопределяем equals для того чтоб дать определ 
    // что значит один унгридиент равен другому ингредиенту
    @Override
    public boolean equals(Object obj) {
        Ingredient t = (Ingredient) obj;
        return t.brand == this.brand;
    }
    

}
