package task1factorymethod.factory;

import task1factorymethod.food.Dish;
import task1factorymethod.food.FoodEnum;

public class KitchenFactory {
    public static Dish cook(FoodEnum foodEnum) {
        return foodEnum.getDish();
    }
}
