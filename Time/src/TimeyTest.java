import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TimeyTest {

    @Test
    void test() {
        // fail("Not yet implemented");
        Time t1= new Time(5, 20);
        // boolean tt=t1.equals(null);
        assertEquals(true, t1.equals(t1));

        Time t4= new Time(3, 30);
        // assertThrows(AssertionError.class,t4.equals(null));
    }

}
