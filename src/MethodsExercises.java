import java.util.Scanner;

public class MethodsExercises {

//    //addition
//    public static int addition(int a, int b) {
//        return (a + b);
//    }
//
//    //subtraction
//    public static int subtraction(int a, int b) {
//        return (a - b);
//    }
//
//    //multiplication
//    public static int multiplication(int a, int b) {
//        return (a * b);
//    }
//
//    //division
//    public static int division(int a, int b) {
//        return (a / b);
//    }
//
//    //modulus
//    public static int modulus(int a, int b) {
//        return (a % b);
//    }

    //bonus
//    public static int multiply(int x, int y) {
//        if (x == 0 || y == 0) {
//            return 0;
//        } else if (y > 0) {
//            System.out.println("x " + x);
//            System.out.println("y " + y);
//
//            int count = x + multiply(x, y - 1);
//
//            System.out.println("count " + count);
//
//            return count;
//        }
//        return multiply(x, y);
//    }

    //(2) Validate user input;

//     public static void getInteger() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number between 1 and 10: ");
//         int min =  Integer.parseInt(sc.nextLine());
//         int max =  Integer.parseInt(sc.nextLine());

//         if (( ((min > 0) && (min < 10)) && ((max > 0) && (max <= 10))  )){
//         System.out.println("Congrats, your input is within range!");

//         }else {
//             System.out.println("Try Again:");
//             getInteger();

//         }

//     }

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 50: ");
//        int userInput = sc.nextInt();
//
//        if (userInput > max || userInput < min) {
//            System.out.println("Try Again:");
//            return getInteger(min, max);
//        }
//        System.out.println("Congrats, your input is within range!");
//        return userInput;
//
//    }

    // (3) Factorial

//    public static void factorial() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number and we will calculate the factorial of it!");
//
//        int userInput = sc.nextInt();
//        //continue
//        System.out.print("Would you like to continue? [y/N] ");
//        String userAnswer = sc.next();
//        boolean confirm = userAnswer.equalsIgnoreCase("y");
//        //if yes
//        if(confirm) {
//            int result = 1;
//            for (int i = userInput; i > 0; i--) {
//                result = result * i;
//            }
//                System.out.println(result);
//            factorial();
//        }
//    }


    //(4) Dice game
//    public static void dice() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many sides do you want your die to have?");
//        int dieSides = sc.nextInt();
//        System.out.print("Would you like to roll? [y/N] ");
//        String userAnswer = sc.next();
//        boolean confirm = userAnswer.equalsIgnoreCase("y");
//        if(confirm) {
//            int a = (int) (Math.random() * dieSides);
//            int b = (int) (Math.random() * dieSides);
//
//            System.out.println("die 1 rolled: " + a + "\ndie 2 rolled: " + b);
//            dice();
//        }
//    }



    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(3, 2));
//        System.out.println(multiplication(3, 2));
//        System.out.println(division(6, 2));
//        System.out.println(modulus(20, 2));
//        System.out.println("times for loop " + times(2, 3));
//        System.out.println("answer "+ multiply(4,10));
//        getInteger(1, 50);
//        factorial();
//        dice();

    }
}