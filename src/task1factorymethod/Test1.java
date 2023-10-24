package task1factorymethod;

import task1factorymethod.factory.KitchenFactory;
import task1factorymethod.food.Dish;
import task1factorymethod.food.italianfood.ItalianFood;
import task1factorymethod.food.italianfood.Osobyko;

public class Test1 {
    public static void main(String[] args) {
        Dish dish = KitchenFactory.cook(ItalianFood.OSOBYKO);
        if (dish.getClass() == Osobyko.class) {
            System.out.println("Блюдо Особуко было приготовлено");
        }

    }
}
