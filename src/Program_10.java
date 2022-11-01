import java.util.ArrayList;
import java.util.Scanner;

/*
10. Write the programme that tell you which line pass through particular stations. Just use Zone 1 stations name.*/
public class Program_10 {

    public static void main(String[] args) {

        ArrayList<String> zone1station = new ArrayList<>();
        zone1station.add("Covent Garden");
        zone1station.add("Leicster Square");
        zone1station.add("Holborn");
        zone1station.add("Tottenham Court");
        zone1station.add("Charing Cross");

        System.out.println("Zone 1 Stations");
        System.out.println("===============");
        for (String pri : zone1station) {
            System.out.println(pri);
        }
        System.out.println("================");
        ArrayList<String> lines = new ArrayList<>();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Zone Station 1: ");
        String zone1 = s1.nextLine();

        if (zone1.equals("Covent Garden")) {
            lines.add("Piccadilly");
        } else if (zone1.equals("Leicster Square")) {
            lines.add("Northern");
            lines.add("Piccadilly");
        } else if (zone1.equals("Holborn")) {
            lines.add("Central");
            lines.add("Piccadilly");
        } else if (zone1.equals("Tottenham Court")) {
            lines.add("Central");
            lines.add("Northern");
        } else if (zone1.equals("Charing Cross")) {
            lines.add("Bakerloo");
            lines.add("Northern");
        } else {
            System.out.println("No Further information for Zone 1 Station");
        }
        s1.close();
        for (int i = 0; i < lines.size(); i++) {

            System.out.println((i + 1) + ") " + lines.get(i));

        }

    }

}
