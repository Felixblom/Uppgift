import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UppgiftTextTest2 {

    @Test
    void text() {

            StringBuilder string = new StringBuilder();
            string.append("String" + " ");
            string.append("Builder" + " ");
            string.append("Test" + " ");

            assertEquals("String Builder Test ", string.toString());

    }
}