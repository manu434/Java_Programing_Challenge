import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleThrows {
    // Method that throws an IOException
    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(reader.readLine()); // This may throw IOException
        System.out.println("You entered: " + number);
    }

    public static void main(String[] args) {
        try {
            readData();  // Calling the method that declares throws
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
