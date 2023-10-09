package factorymethod.food.mexicanfood;

import factorymethod.food.Dish;
import factorymethod.food.FoodEnum;
import factorymethod.food.asianfood.Ramen;

public enum MexicanFood implements FoodEnum {
    KEBAB(new Kebab()),
    TACOS(new Taсos()),
    BURRITOS(new Burritos());

    private final Dish dish;
    public Dish getDish() {
        return dish;
    }
    MexicanFood(Dish dish) {
        this.dish = dish;
    }
}
