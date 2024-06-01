import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("sample.txt");
            System.out.println("File opened successfully");
           
        } catch (FileNotFoundException e) {
            System.out.println("Catch: File not found");
        } catch (IOException e) {
            System.out.println("Catch: IO exception");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("Finally: File closed");
                } catch (IOException e) {
                    System.out.println("Finally: Error closing file");
                }
            }
        }
    }
}

