package factorymethod.food.italianfood;

import factorymethod.food.Dish;
import factorymethod.food.FoodEnum;

public enum ItalianFood implements FoodEnum {
    CARBONARA(new Carbonara()),
    PARMIJANO(new Parmijano()),
    OSOBYKO(new Osobyko())
    ;

    private final Dish dish;
    public Dish getDish() {
        return dish;
    }
    ItalianFood(Dish dish) {
        this.dish = dish;
    }
}
