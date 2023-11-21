package ie.atu;
import java.io.FileWriter;
import java.io.IOException;
public class fileWriter {

        public static void main(String[] args)
        {
            // initialize a string
            String fileWriter = "This is a new string to add to the file";
            try {

                // attach a file to FileWriter
                FileWriter fw = new FileWriter("C:\\Users\\G00415662@atu.ie\\OneDrive - Atlantic TU\\OOP\\Lab8\\Lab8OOP\\File13.txt");

                // read each character from string and write
                // into FileWriter
                for (int i = 0; i < fileWriter.length(); i++)
                    fw.write(fileWriter.charAt(i));

                System.out.println("Successfully written");

                // close the file
                fw.close();
            }
            catch (IOException e) {
                e.getStackTrace();
            }
        }
    }


