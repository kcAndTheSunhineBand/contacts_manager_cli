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
    //     ADD content to the file
    public static void writeToFile() throws IOException {
        System.out.println("Please enter first name: ");
        Scanner in = new Scanner(System.in);
        String fname= in.nextLine();

        System.out.println("Please enter last name: ");
        Scanner in2 = new Scanner(System.in);
        String lname= in.nextLine();

        System.out.println("Please enter last name: ");
        Scanner in3 = new Scanner(System.in);
        String pnumber= in.nextLine();

        String contact = fname + " " + lname + " | " + pnumber;

        Path filepath = Paths.get("places", "countries.txt");
//        System.out.println(filepath);

        List<String> countries = Arrays.asList(contact);

//        String title = "These are countries:";

        Files.write(filepath, countries, StandardOpenOption.APPEND);
//        System.out.println(Files.readAllLines(filepath));

//        List<String> fileContents = Files.readAllLines(filepath);
//        System.out.println(fileContents);

    }
}
