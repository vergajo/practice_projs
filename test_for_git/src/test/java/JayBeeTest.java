import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JayBeeTest {


    @Test
    public void name() {
        JayBee jaybee = new JayBee();
        assertEquals("JayBee Success", jaybee.print());
    }
}
