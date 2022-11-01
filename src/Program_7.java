import java.util.ArrayList;

/*
7. Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Program_7 {
    public static void main(String[] args) {
        ArrayList<String> tubename = new ArrayList<>();

        boolean ans = tubename.isEmpty();

        if (ans == true) {
            System.out.println("The Array list is Empty");
        } else {
            System.out.println("The Array list is not Empty");
        }

        tubename.add("Bakerloo");
        tubename.add("Central");
        tubename.add("Circle");
        tubename.add("Jubilee");
        tubename.add("Hammersmith & City");
        ans=tubename.isEmpty();

        if (ans == true) {
            System.out.println("The Array list is Empty");
        } else {
            System.out.println("The Array list is not Empty");
        }

    }

}
