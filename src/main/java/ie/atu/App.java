package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner file = new Scanner(System.in);

        System.out.println("Please enter a file name");
        String fileName = file.nextLine();


        try(PrintWriter prw = new PrintWriter(new FileWriter(fileName,true))) {

            prw.println("Top");
            prw.printf("Crazy Stuff");

            System.out.println("Content has successfully been written to the file");


        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}