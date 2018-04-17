package Stalls;
import Interfaces.*;
import Visitors.Visitor;

public class TobaccoStall extends Stall{

    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    public boolean isAllowedTo(Visitor visitor){
        boolean isOldEnough = visitor.getAge() >= 18;
        return isOldEnough;
    }



}
