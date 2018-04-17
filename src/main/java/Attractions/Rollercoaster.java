package Attractions;

import Attractions.Attraction;
import Interfaces.IChargeable;
import Interfaces.IRestrictable;
import Visitors.Visitor;

public class Rollercoaster extends Attraction implements IChargeable, IRestrictable {


    public Rollercoaster(String name, int funLevel) {
        super(name, funLevel);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor){
        boolean isOldEnough = visitor.getAge() >= 12;
        boolean isTallEnough = visitor.getHeight() >= 145;
        return isTallEnough && isOldEnough;
    }

;
    }





}
