import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class UppgiftTextTest {

    //Testa metoder som sparar och hämtar data i UppgiftRakna på 3 olika sätt
    @Test
    public void testCharCount() {

        UppgiftRakna ur = new UppgiftRakna();
        int expected = 0;
        int actual = ur.getCharCount();

        assertEquals(expected, actual);
    }

    @Test
    public void testCharCount2() {
        UppgiftRakna ur = new UppgiftRakna();

        ur.myCharCount("hej");

        int expected = 3;
        int actual = ur.getCharCount();
        assertEquals(expected, actual);
    }

    @Test
    public void testCharCount3() {
        UppgiftRakna ur = new UppgiftRakna();

        ur.myCharCount("hej");
        ur.myCharCount("nej");

        int expected = 6;
        int actual = ur.getCharCount();
        assertEquals(expected, actual);
    }

    @Test
    public void testRowCount() {

        UppgiftRakna ur = new UppgiftRakna();

        int expected = 0;
        int actual = ur.getRowCount();

        assertEquals(expected, actual);

    }

    @Test
    public void testRowCount2() {

        UppgiftRakna ur = new UppgiftRakna();
        ur.myRowCount();
        int expected = 1;
        int actual = ur.getRowCount();

        assertEquals(expected, actual);

    }

    @Test
    public void testRowCount3() {

        UppgiftRakna ur = new UppgiftRakna();
        ur.myRowCount();
        ur.myRowCount();
        ur.myRowCount();

        int expected = 3;
        int actual = ur.getRowCount();

        assertEquals(expected, actual);

    }

}