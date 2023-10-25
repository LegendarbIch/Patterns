package task2abstractfactory.factory;

import task2abstractfactory.buildings.*;

public class CityBuildingsFactory implements BuildingsFactory{
    @Override
    public CommercialBuilding createCommercialBuilding() {
        System.out.println("Магазин был построен");
        return new Shop();
    }

    @Override
    public IndustrialBuilding createIndustrialBuilding() {
        System.out.println("Лабратория была построена");
        return new Laboratory();
    }

    @Override
    public ResidentialBuilding createResidentialBuilding() {
        System.out.println("Мэрия была построена");
        return new CityHall();
    }
}
