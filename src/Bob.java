import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        String sure = "Sure";
        String chillOut = "Whoa, chill out!";
        String fine = "Fine. Be that way!";
        String whatever = "Whatever...";
        String bye = "Bye!";

        Scanner sc = new Scanner(System.in);
        System.out.println("This is Bob:  0_0\n" +
                "              -|-\n" +
                "              / \\\n" +
                "Talk to Bob:");
        System.out.println("(...If you'd ever like to end your talk with Bob type: 'bye')");
        String userInput;

        do {
            userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.print(sure);
                System.out.print("  ^_^\n" +
                        "      -|-\n" +
                        "      / \\\n");
            } else if (userInput.endsWith("!")) {
                System.out.print(chillOut);
                System.out.print("  0_0\n" +
                        "                  ~|~\n" +
                        "                  / \\\n");
            } else if (userInput.equals("")) {
                System.out.print(fine);
                System.out.print("  0_o\n" +
                        "                    <|>\n" +
                        "                    / \\\n");
            }else if(userInput.equals("bye")){
                System.out.print(bye);
                System.out.print(" 0_0\n" +
                        "     <|-'\n" +
                        "     / \\\n");
            } else {
                System.out.print(whatever);
                System.out.print("  -_-\n" +
                        "              <|>\n" +
                        "              / \\\n");
            }
        } while(!userInput.equals("bye"));



    }
}