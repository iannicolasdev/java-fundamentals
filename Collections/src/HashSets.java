import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        String[] namesArray = {"Ian", "Evy", "Elton", "Ana", "Ian"};

        for (String name : namesArray) {
            names.add(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println(names.size());
        System.out.println(names.contains("Ian"));
        System.out.println(names.contains("João"));
    }
}
