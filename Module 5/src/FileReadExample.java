import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(file);

            String line = br.readLine();
            System.out.println("First line: " + line);

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Problem while reading the file.");
        }
    }
}

