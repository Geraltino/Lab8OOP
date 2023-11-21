package ie.atu;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class printS {
    public static void main(String[] args)
    {

        // initialize a string
        String fileName = "File13.txt";
        try(PrintWriter prw = new PrintWriter(new FileWriter(fileName,true))) {

            prw.println("Top");
            prw.printf("a line like no other: %d,%s%n", 42, "example");

            System.out.println("Content has successfully been written to the file");

        }
        catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }

}


