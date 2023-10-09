package factorymethod;

import factorymethod.food.Dish;
import factorymethod.food.italianfood.ItalianFood;
import factorymethod.food.italianfood.Osobyko;

public class Test1 {
    public static void main(String[] args) {
        Dish dish = KitchenFactory.cook(ItalianFood.OSOBYKO);
        if (dish.getClass() == Osobyko.class) {
            System.out.println("Блюдо Особуко было приготовлено");
        }

    }
}
