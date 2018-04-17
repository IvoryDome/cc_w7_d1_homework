import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StallTest {

    Playground playground;
    Visitors.Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("Adventure Playground");
        visitor = new Visitors.Visitor(18, 190, 100);
    }





    @Test
    public void doesIRestrictableWork(){
        assertEquals(false, playground.isAllowedTo(visitor));
        assertEquals(false, playground.isAllowedTo(visitor));
    }

}
