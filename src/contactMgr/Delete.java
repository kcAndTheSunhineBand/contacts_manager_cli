package contactMgr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Delete {
    //     ADD content to the file
    public static void deleteFromFile() throws IOException {
        System.out.println("Please enter name to delete: ");
        Scanner din = new Scanner(System.in);
        String contact= din.next();

//        String contact = fname + " " + lname + " | " + pnumber;

        Path filepath = Paths.get("places", "countries.txt");
//        System.out.println(filepath);

        List<String> countries = Arrays.asList(contact);
        countrie.remove(contact);

//       List<String> countries = Arrays.;

//        String title = "These are countries:";

        Files.write(filepath, countries, StandardOpenOption.APPEND);
//        System.out.println(Files.readAllLines(filepath));

//        List<String> fileContents = Files.readAllLines(filepath);
//        System.out.println(fileContents);



    }
}

