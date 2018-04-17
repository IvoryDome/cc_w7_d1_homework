package Attractions;

public abstract class Attraction {

    private String name;
    private int funLevel;

    public Attraction(String name, int funLevel){
        this.name = name;
        this.funLevel = funLevel;
    }

    public String getName(){
        return name;
    }

    public int getFunLevel() {
        return funLevel;
    }
}
