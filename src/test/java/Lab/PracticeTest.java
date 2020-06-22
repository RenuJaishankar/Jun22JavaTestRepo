package Lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {
    @Test
    void doesAdd() {
        Practice practice = new Practice();
        assertEquals(9, practice.doesAdd(4, 5));
    }

    @Test
    void throwsStuff() {
        Practice practice = new Practice();
        assertThrows(Exception.class, practice::throwsStuff);
    }
}

