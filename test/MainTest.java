import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int[]arr;
    @Test
    void testCreateRandom100(){
        arr=Main.createRandom();
        assertEquals(100,arr.length);
    }
}