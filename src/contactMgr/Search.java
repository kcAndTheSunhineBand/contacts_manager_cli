package contactMgr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Search {

    public static Path filepath = Paths.get("places", "contacts.txt");

    public static void searchFromFile() throws IOException {
        System.out.println("Please enter name to search: ");
        Scanner search = new Scanner(System.in);
        String contact= search.nextLine();

        List<String> countries = Files.readAllLines(filepath);
        for (String country : countries) {
            if (country.equals(contact)) {
                System.out.println("You searched for :" + contact);
                Files.write(filepath, countries);
            }
        }
    }
}


