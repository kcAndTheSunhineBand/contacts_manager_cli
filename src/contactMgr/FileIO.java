//package contactMgr;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.Arrays;
//import java.util.List;
//
//import static contactMgr.Write.writeToFile;
//
//public class FileIO {
//    public static void main(String[] args) throws IOException {
//
////        create directory & file
//        String directory = "places";
//        String filename = "countries.txt";
//
//        Path myDirectory = Paths.get(directory);
//        Path myFile = Paths.get(directory, filename);
////        System.out.println(myDirectory);
////        System.out.println(myFile);
//
//        if (Files.notExists(myDirectory)) {
//            Files.createDirectories(myDirectory);
//        }
//
//        if (!Files.exists(myFile)) {
//            Files.createFile(myFile);
//        }
//
//        writeToFile();
//        readFileContents();
//    }
//
//
//
//    public static void readFileContents() throws IOException {
//        Path filepath = Paths.get("places", "countries.txt");
//        List<String> fileContents = Files.readAllLines(filepath);
//        System.out.println(fileContents);
//    }
//}