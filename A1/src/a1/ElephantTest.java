package a1;

import org.junit.jupiter.api.Test;

class ElephantTest {

    @Test
    void testConstructor1() {
        Elephant e1= new Elephant("ellie", 'F', 2003, 7);
        System.out.println(e1.name());

    }

}
