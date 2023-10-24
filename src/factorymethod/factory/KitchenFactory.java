package factorymethod.factory;

import factorymethod.food.Dish;
import factorymethod.food.FoodEnum;

public class KitchenFactory {
    public static Dish cook(FoodEnum foodEnum) {
        return foodEnum.getDish();
    }
}
