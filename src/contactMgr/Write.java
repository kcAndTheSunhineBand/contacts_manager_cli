package contactMgr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Write {

    public static void writeToFile() throws IOException {
        System.out.println("Please enter first name: ");
        Scanner in = new Scanner(System.in);
        String fname= in.nextLine();

        System.out.println("Please enter last name: ");
        Scanner in2 = new Scanner(System.in);
        String lname= in2.nextLine();

        System.out.println("Please enter phone number: ");
        Scanner in3 = new Scanner(System.in);
        String pnumber= in3.nextLine();

        String contact = fname + " " + lname + " | " + pnumber;

        Path filepath = Paths.get("places", "contacts.txt");

        List<String> contacts = Arrays.asList(contact);

        Files.write(filepath, contacts, StandardOpenOption.APPEND);

    }
}
