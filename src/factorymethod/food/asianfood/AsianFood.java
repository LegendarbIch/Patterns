package factorymethod.food.asianfood;

import factorymethod.food.Dish;
import factorymethod.food.FoodEnum;

public enum AsianFood implements FoodEnum {
    SUSHI(new Sushi()),
    RAMEN(new Ramen()),
    RICE(new Rice())
    ;

    private final Dish dish;
    public Dish getDish() {
        return dish;
    }
    AsianFood(Dish dish) {
        this.dish = dish;
    }
}
