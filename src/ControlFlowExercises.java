import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//===1(a)

//        int i = 5;
//
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        for(int i = 5; i<= 15; i++ ){
//            System.out.println(i);
//        }

//===1(b)

//            int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);

//        for(int i = 0; i<= 100; i+=2 ){
//            System.out.println(i);
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while(i < 1000000);

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//===2
// FIZZBUZZ

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if ((i % 3) == 0) {
//                System.out.println("Fizz");
//            } else if ((i % 5) == 0) {
//                System.out.println("Buzz");
//            } else
//                System.out.println(i);
//        }

//Table of Powers

//        System.out.println("Enter a whole number:");
//        int userInput = sc.nextInt();
//
//        System.out.print("Continue? [y/N] ");
//        String userAnswer = sc.next();
//        boolean confirmation = userAnswer.equalsIgnoreCase("y");
//
//            if (confirmation) {
//                System.out.println("Here is your table!\n");
//                System.out.print("number | squared | cubed \n");
//                System.out.println("------ | ------  | ------");
//
//                for (int i = 1; i <= userInput; i++) {
//                    System.out.printf("%-7d|%-9d|%-7d\n", i, i*i, i*i*i);
//                }
//        }else {
//                System.out.println("Terminated");
//            }
//
//
////Grades
//        System.out.println("Check all of your grades here.");
//        System.out.println("To exit type 'done'.");
//        System.out.print("Would you like to continue? [y/N] ");
//        String userAnswer = sc.next();
//        boolean confirmation = userAnswer.equalsIgnoreCase("y");
//        if (confirmation) {
//            System.out.println("Enter your numerical grade.");
//
//            int userInput;
//            String userExit;
//
//            do {
//                userInput = sc.nextInt();
////                userExit = sc.nextLine();
//
//                if ((userInput <= 100) && (userInput >= 94)) {
//                    System.out.println("Your letter grade is: A+");
//                } else if ((userInput <= 93) && (userInput >= 88)) {
//                    System.out.println("Your letter grade is: A-");
//                } else if ((userInput <= 87) && (userInput >= 85)) {
//                    System.out.println("Your letter grade is: B+");
//                } else if ((userInput <= 84) && (userInput >= 80)) {
//                    System.out.println("Your letter grade is: B-");
//                } else if ((userInput <= 79) && (userInput >= 73)) {
//                    System.out.println("Your letter grade is: C+");
//                } else if ((userInput <= 72) && (userInput >= 67)) {
//                    System.out.println("Your letter grade is: C-");
//                } else if ((userInput <= 66) && (userInput >= 63)) {
//                    System.out.println("Your letter grade is: D+");
//                } else if ((userInput <= 62) && (userInput >= 60)) {
//                    System.out.println("Your letter grade is: D-");
//                } else if ((userInput <= 61) && (userInput >= 0)) {
//                    System.out.println("Your letter grade is: F");
//                }else{
//                    System.out.println("Not a grade, try again");
//                }
//                System.out.print("Would you like to continue? [y/N] ");
//                userExit = sc.next();
//            } while (userExit.equalsIgnoreCase("y"));
//        }
//

    }
}