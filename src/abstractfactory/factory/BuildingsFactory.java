package abstractfactory.factory;

import abstractfactory.buildings.CommercialBuilding;
import abstractfactory.buildings.IndustrialBuilding;
import abstractfactory.buildings.ResidentialBuilding;

public interface BuildingsFactory {

    CommercialBuilding createCommercialBuilding();
    IndustrialBuilding createIndustrialBuilding();
    ResidentialBuilding createResidentialBuilding();
}
