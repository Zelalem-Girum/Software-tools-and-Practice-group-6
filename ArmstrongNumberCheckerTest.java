package Tools_assignment;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class ArmstrongNumberCheckerTest {

    @Test
    public void testIsArmstrongNumber() {
        assertTrue(ArmstrongNumberChecker.isArmstrongNumber(153));
        assertTrue(ArmstrongNumberChecker.isArmstrongNumber(9474));
        assertTrue(ArmstrongNumberChecker.isArmstrongNumber(0));
        assertFalse(ArmstrongNumberChecker.isArmstrongNumber(123));
        assertFalse(ArmstrongNumberChecker.isArmstrongNumber(1234));
        assertTrue(ArmstrongNumberChecker.isArmstrongNumber(-153));
    }
}

