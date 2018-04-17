package Attractions;

import Attractions.Attraction;
import Interfaces.IRestrictable;
import Visitors.*;


public class Playground extends Attraction implements IRestrictable {

    private Visitor visitor;


    public Playground(String name, int funLevel) {
        super(name, funLevel);

    }


    public boolean isAllowedTo(Visitor visitor){
        boolean isYoungEnough = visitor.getAge() <= 15;
        return isYoungEnough;
    }




}
