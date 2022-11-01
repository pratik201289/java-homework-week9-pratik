/*8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)*/

import java.util.HashSet;

public class Program_8 {


    public static <Hashset> void main(String[] args) {

        //create the Hashset Object
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i=1; i<=10;i ++){
            if(numbers.contains(i)){
                System.out.println(i + " this number found in set");
            }
            else
            {
                System.out.println(i + " this number not dound in set");
            }
        }

    }
}
