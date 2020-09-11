import java.util.Arrays;

public class ArraysExercises {

    //===1
    public static String[] addPerson(String[] arrays, String p) {
        String[] addPersonCopy = Arrays.copyOf(arrays, arrays.length + 1);
        addPersonCopy[addPersonCopy.length - 1] = p;
        return addPersonCopy;
    }

    //====== PSVM =======
    public static void main(String[] args) {

        //===1
        String[] persons = {"Deena", "Shelby", "Brandi"};

        String[] newPerson = addPerson(persons, "Leelah");
        for (String person : newPerson) {
            System.out.println(person);
        }
//        String[] newPerson = addPerson(persons, "Leelah");
    }





}