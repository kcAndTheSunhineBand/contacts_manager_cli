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
        Integer fname= din.nextInt();

//        String contact = fname + " " + lname + " | " + pnumber;

        Path filepath = Paths.get("places", "countries.txt");
//        System.out.println(filepath);

//        List<String> countries = Arrays.asList(contact);
        array = ArrayUtils.removeElement(contact, element);

//       List<String> countries = Arrays.;

//        String title = "These are countries:";

        Files.write(filepath, countries, StandardOpenOption.APPEND);
//        System.out.println(Files.readAllLines(filepath));

//        List<String> fileContents = Files.readAllLines(filepath);
//        System.out.println(fileContents);

    }
}

//    List<String> values = new ArrayList<String>();
//values.add("A");
//        values.add("B");
//        values.add("C");
//        values.add("D");
//        values.add("E");
//        values.add("D");
//
//        BufferedWriter fileWriter = null;
//        try
//        {
//        fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("fileName.txt")));
//
//        for (String value : values)
//        {
//        fileWriter.write(value + System.getProperty("line.separator"));
//        }
//        }
//        finally
//        {
//        if (fileWriter != null)
//        fileWriter.close();
//        }
