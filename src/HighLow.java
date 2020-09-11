import java.util.Scanner;

public class HighLow {

    public static int random() {
        return (int) (Math.random() * 100);
    }

    public static void highLow() {
        int random = random();
        System.out.println("random: " + random);
        System.out.println("Guess a number 1 & 100!");
        Scanner sc = new Scanner(System.in);
//make do while
        String userAnswer;
        do {
            int userInput = sc.nextInt();
            if (userInput > random) {
                System.out.println("LOWER");
                highLow();
            } else if (userInput < random) {
                System.out.println("HIGHER");
                highLow();
            } else {
                System.out.println("GOOD GUESS!");

            }
            System.out.print("Would you like to play again? [y/N] ");
            userAnswer = sc.next();
        } while (userAnswer.equalsIgnoreCase("y"));
    }


    public static void main(String[] args) {
        highLow();
    }
}