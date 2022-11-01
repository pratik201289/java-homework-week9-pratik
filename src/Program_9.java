/*9. Create a HashMap object called people that will store String keys and Integer values:
And use for each loop to iterate the value from Map.*/

import java.util.HashMap;

public class Program_9 {
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Pratik", 31);
        people.put("Hiral", 30);
        people.put("Komal", 33);
        people.put("Sunil",34);

        for (String i : people.keySet()) {
            System.out.println("Key: " + i + " Value: " + people.get(i));
        }
    }
}
