import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UppgiftTextTest {

    @Test
    void text() {
    StringBuilder bok = new StringBuilder("acbdefg stop");

          assertEquals("acbdefg", bok.substring(0,bok.toString().length()-5));
    }
}