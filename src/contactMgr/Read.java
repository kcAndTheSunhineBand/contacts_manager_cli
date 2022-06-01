package contactMgr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Read {

    public static void readFileContents() throws IOException {
        Path filepath = Paths.get("places", "countries.txt");
        List<String> fileContents = Files.readAllLines(filepath);
        System.out.println(fileContents);
    }
}
