package abstractfactory;

import abstractfactory.buildings.CommercialBuilding;
import abstractfactory.buildings.IndustrialBuilding;
import abstractfactory.buildings.ResidentialBuilding;
import abstractfactory.factory.BuildingsFactory;
import abstractfactory.factory.CityBuildingsFactory;

public class Test2 {

    public static void main(String[] args) {
        BuildingsFactory cityBuildingsFactory = new CityBuildingsFactory();

        CommercialBuilding commercialBuilding = cityBuildingsFactory.createCommercialBuilding();
        IndustrialBuilding industrialBuilding = cityBuildingsFactory.createIndustrialBuilding();
        ResidentialBuilding residentialBuilding = cityBuildingsFactory.createResidentialBuilding();

    }

}
