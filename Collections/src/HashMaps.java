import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> users = new HashMap<>();

        users.put(20, "Ian");
        users.put(22, "Evy");
        users.put(24, "Elton");
        users.put(18, "Ana");

        System.out.println(users.get(22));
        System.out.println("User removed: " + users.remove(18));
        System.out.println(users.containsKey(24));
        System.out.println(users.containsKey(30));
        System.out.println(users.containsValue("Ian"));
        System.out.println();

        System.out.println("Keys:");
        for (Integer id : users.keySet()) {
            System.out.println(id);
        }

        System.out.println();

        System.out.println("Values:");
        for (String name : users.values()) {
            System.out.println(name);
        }

        System.out.println();

        System.out.println("Keys -> Values:");
        for (var entry : users.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
