package contactMgr;

import java.util.Arrays;
import java.util.Scanner;



import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int exit = 5;
        int answer;
        //we will loop until user wants to exit the application
        do {
            System.out.println("✅ 1. View contacts.");
            System.out.println("✅ 2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("✅ 5. Exit.");
            System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
            try {
                answer = input.nextInt();
            } catch (NumberFormatException e) {
                answer = -1;
            }
            if(answer == 2)
                Write.writeToFile();
//            else if(answer == 2);
////                Search.choose_field();
            else if(answer == 1)
                Read.readFileContents();
            else if(answer == 4)
                Delete.deleteFromFile();
//            else if(answer == 5)
////                Delete.choose_field();


        }while(answer != exit);
        System.out.println("Have a great day!");
    }
}