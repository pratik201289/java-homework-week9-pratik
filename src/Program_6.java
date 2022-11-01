/*
6. Write a Java program to retrieve an element (at a specified index) from a given array list
*/

import java.util.ArrayList;

public class Program_6 {
    // Creae a list and add europe cities to the list
    public static void main(String[] args) {

        ArrayList <String> europecity = new ArrayList<>();
        europecity.add("France");
        europecity.add("Italy");
        europecity.add("Amsterdam");
        europecity.add("Portugal");
        europecity.add("Spain");
        europecity.add("Switzerland");

        for(String str: europecity) {
            System.out.println(str);
        }
        //Retrieve the elements from index

        String element =europecity.get(0);
        System.out.println("First Element: " + element);
        element =europecity.get(3);
        System.out.println("Fourth Element: " + element);
        element=europecity.get(4);
        System.out.println("Five Element: " + element);

    }

}
