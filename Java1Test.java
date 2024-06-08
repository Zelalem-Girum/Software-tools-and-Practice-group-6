package Tast1;
import org.junit.jupiter.api.Test;
import JavaFile.Java1;
import static org.junit.jupiter.api.Assertions.*;

public class Java1Test {

    @Test
    void testIsArmstrongWithArmstrongNumber() {
        assertTrue(new Java1().isArmstrong(153));
       assertTrue(new Java1().isArmstrong(9474));
        //assertTrue(new Java1().isArmstrong(9475));
    }

    @Test
    void testIsArmstrongWithNonArmstrongNumber() {
        assertFalse(new Java1().isArmstrong(123));
        //assertFalse(new Java1().isArmstrong(370));
       //assertFalse(new Java1().isArmstrong(1634));
    }

    @Test
    void testIsArmstrongWithSingleDigitNumber() {
        assertTrue(new Java1().isArmstrong(0)); 
        assertTrue(new Java1().isArmstrong(1));
        assertTrue(new Java1().isArmstrong(9));
    }
}