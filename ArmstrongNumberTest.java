package tasting2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import tasting2.ArmstrongNumber;
import java.util.Scanner;

public class ArmstrongNumberTest {

    @Test
    void testIsArmstrongWithArmstrongNumber() {
    	System.out.println("enter a number");
    	int a=new Scanner().nextInt();
    	Assertions.assertTrue(new ArmstrongNumber().isArmstrong(a));
    }

    @Test
    void testIsArmstrongWithNonArmstrongNumber() {
    	System.out.println("enter a number");
    	int a=new Scanner().nextInt();
    	Assertions.assertFalse(new ArmstrongNumber().isArmstrong(a));
    }

    @Test
    void testIsArmstrongWithSingleDigitNumber() {
    	System.out.println("enter a number");
    	int a=new Scanner().nextInt();
    	Assertions.assertTrue(new ArmstrongNumber().isArmstrong(a));
    }
}
