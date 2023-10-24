package task2abstractfactory;

import task2abstractfactory.buildings.CommercialBuilding;
import task2abstractfactory.buildings.IndustrialBuilding;
import task2abstractfactory.buildings.ResidentialBuilding;
import task2abstractfactory.factory.BuildingsFactory;
import task2abstractfactory.factory.CityBuildingsFactory;

public class Test2 {

    public static void main(String[] args) {
        BuildingsFactory cityBuildingsFactory = new CityBuildingsFactory();

        CommercialBuilding commercialBuilding = cityBuildingsFactory.createCommercialBuilding();
        IndustrialBuilding industrialBuilding = cityBuildingsFactory.createIndustrialBuilding();
        ResidentialBuilding residentialBuilding = cityBuildingsFactory.createResidentialBuilding();

    }

}
