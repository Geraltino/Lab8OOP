package ie.atu;
import java.io.FileWriter;
import java.io.IOException;
public class fileWriter {
        public static void main(String[] args)
        {

            // initialize a string
            String fileName = "File13.txt";
            try(FileWriter writer = new FileWriter(fileName, true)) {

                writer.write("\nBottom Text");

                System.out.println("Content has successfully been written to the file");

            }
            catch (IOException e) {
                System.out.println("Error");
                e.printStackTrace();
            }

        }

        }



