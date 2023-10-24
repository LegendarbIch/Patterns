package task1factorymethod.food.mexicanfood;

import task1factorymethod.food.Dish;
import task1factorymethod.food.FoodEnum;

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
