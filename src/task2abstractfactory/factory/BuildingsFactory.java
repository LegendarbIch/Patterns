package task2abstractfactory.factory;

import task2abstractfactory.buildings.CommercialBuilding;
import task2abstractfactory.buildings.IndustrialBuilding;
import task2abstractfactory.buildings.ResidentialBuilding;

public interface BuildingsFactory {

    CommercialBuilding createCommercialBuilding();
    IndustrialBuilding createIndustrialBuilding();
    ResidentialBuilding createResidentialBuilding();
}
