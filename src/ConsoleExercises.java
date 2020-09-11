//import java.util.Scanner;

public class ConsoleExercises {

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * exponent;
    }


    public static void main(String[] args) {
        System.out.println(ConsoleExercises.getPower(29, 0));
////        double pi = 3.14159;
////        System.out.printf("The value of pi is approximately %.2f", pi);
//
//        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner("\n");


//        int num = sc.nextInt();
//        System.out.printf("Your number is %d", num);
//        System.out.println("Enter three words:");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.printf("%n%s%n%s%n%s%n ", word1, word2, word3);

//        System.out.println("Enter a sentence");
//        String sentence1 = sc.nextLine();
//        System.out.printf("Your sentence is: %s", sentence1);
//
//        System.out.println("Enter the length and width of your classroom");
//        Integer length = Integer.parseInt(sc.nextLine());
//        Integer width = Integer.parseInt(sc.nextLine());
//
//        int areaCalc = length * width;
//        int widthCalc = (areaCalc)*2;
//
//        System.out.printf("The length of the classroom is: %d%nThe width of the classroom is: %d%nThe area of the classroom is: %d%nThe perimeter of the classroom is: %d", length, width, areaCalc, widthCalc);



//        System.out.println("In words enter the length and width of your classroom");
//        String stringLength = sc.nextLine();
//        String stringWidth = sc.nextLine();
//        String stringHeight = sc.nextLine();
//
//        double length = Double.parseDouble(stringLength);
//        double width = Double.parseDouble(stringWidth);
//        double height = Double.parseDouble(stringHeight);
//
//        System.out.printf("The length of the classroom is: %s%nThe width of the classroom is: %s%nThe height of the classroom is: %s%nThe area of the classroom is: %.2f%nThe perimeter of the classroom is: %.2f%nThe volume of the of the classroom is: %.2f", stringLength, stringWidth, stringHeight, length*width, ((length*2)+(width*2)), (length*width)*height);



    }
}