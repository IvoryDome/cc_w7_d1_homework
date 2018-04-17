import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AttractionTest {

    Rollercoaster rollercoaster1;
    Dodgems dodgems;
    Park park;
    Playground playground;

    @Before

    public void before(){
        rollercoaster1 = new Rollercoaster("Mr Bones' Wild Ride");
        dodgems = new Dodgems("Bumper Cars");
        park = new Park("Central Attractions.Park");
        playground = new Playground("Adventure Attractions.Playground");
    }

    @Test
    public void rollercoasterHasName(){
        assertEquals("Mr Bones' Wild Ride", rollercoaster1.getName());
    }

    @Test
    public void dodgemsHasName(){
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void parkHasName(){
        assertEquals("Central Attractions.Park", park.getName());
    }

    @Test
    public void playgroundHasName(){
        assertEquals("Adventure Attractions.Playground", playground.getName());
    }











}
