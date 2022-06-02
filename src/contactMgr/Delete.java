package contactMgr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Delete {

    public static Path filepath = Paths.get("places", "contacts.txt");

    public static void deleteFromFile() throws IOException {
        System.out.println("Please enter name to delete: ");
        Scanner userInput = new Scanner(System.in);
        String contact= userInput.nextLine();

        List<String> contacts = Files.readAllLines(filepath);
        for (String country : contacts) {
            if (country.equals(contact)) {
                System.out.println("You deleted: " + contact);
                contacts.remove(contact);
                Files.write(filepath, contacts);
            }
        }
    }
}

