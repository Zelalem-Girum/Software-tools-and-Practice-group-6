package Tools_assignment;

public class ArmstrongNumberChecker {
    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0, digits = 0;

        originalNumber = number;

        // Count number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }

        originalNumber = number;

        // Calculate result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        return result == number;
    }
}


