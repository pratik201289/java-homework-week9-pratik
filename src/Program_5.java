/*5. Write a Java program to iterate through all elements in an array list using Iterator.*/

import java.util.ArrayList;
import java.util.Iterator;

public class Program_5 {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);

        Iterator res = a1.iterator();

        while (res.hasNext()) {
            System.out.println(res.next());

        }

    }


}
