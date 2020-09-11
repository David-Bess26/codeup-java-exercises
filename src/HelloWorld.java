import org.w3c.dom.ls.LSOutput;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        int myFavoriteNumber = 2;
        System.out.println(myFavoriteNumber);

        String myString = "I drink and I know things";
        System.out.println(myString);

//        char wrong = myString;
//        myString = 3.14159;
        long myNumber;
//        System.out.println(myNumber);

//        myNumber = 3.14;
        myNumber = 123L;
        System.out.println(myNumber);

        float newNumber = myNumber;
        System.out.println(newNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int class = 123;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

//        int three = (int) "three";
//        System.out.println(three);


        int x = 4;
        x += 5;

        int a = 3;
        int b = 4;
        b *= a;

        int q = 10;
        int r = 2;
        q /= r;

        short bigger = -130;
        byte tooBig = (byte) bigger;
        System.out.println(tooBig);


    }
}
//shortcuts
//psvm then tab == public static void
//sout control j == printing out line
//command r will run the program