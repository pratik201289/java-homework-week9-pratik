import java.util.ArrayList;

/*4. Write a Java program to create a new array list,
add some colours (string) and printout the collection using for each loop.*/
public class Program_4 {

    public static void main(String[] args) {

        ArrayList <String> colors =new ArrayList<>();
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Black");
        colors.add("White");
        colors.add("Red");

        for(String colname: colors){

            System.out.println(colname);
        }


    }

}
