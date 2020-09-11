import java.lang.Math;
import java.util.Arrays;

public class ServerNameGenerator {

    public static int randomWord(String[] arrays){
        return (int) Math.floor(Math.random() * arrays.length);
    }

    public static void main(String[] args) {
        String[] adjectives = {"attractive", "jolly", "puny", "colossal", "thankful", "bewildered", "scary", "mysterious", "plain", "shapely"};
        String[] nouns = {"helicopter", "king", " lunch", "oyster", "lighter", "lion", "insurance", "nail", "lizard", "magazine"};

        String adjective = adjectives[randomWord(adjectives)];
        String noun = (nouns[randomWord(nouns)]);

        System.out.printf("Your server name is:\n%s - %s", adjective, noun);

    }
}
