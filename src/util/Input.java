package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    public String getString() {
        return scanner.next();
    }

    boolean yesNo() {
        System.out.println("Please enter \"yes/ y\"");
        String newYes = getString();
        return newYes.equalsIgnoreCase("yes") || newYes.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter number between %s and %s", min, max);
        int number = Integer.valueOf(getString());
        try {
            if ((number < min) || (number > max))
                return getInt(min, max);
        } catch (Exception e) {
            getInt(min, max);
        }
        System.out.println("great! Your number is: " + number);
        return number;
    }
    public int getInt() {
        System.out.println("enter number");
        return Integer.parseInt(getString());
    }

    public double getDouble(double min, double max) {
        double number = Double.valueOf(getString());
        try {
            if ((number < min) || (number > max))
                return getDouble(min, max);
        } catch (Exception e) {
            getDouble(min, max);
        }
        System.out.println("great! Your number is: " + number);
        return number;
    }

    public double getDouble(){
        System.out.println("enter number");
        return Double.parseDouble(getString());

    }
}