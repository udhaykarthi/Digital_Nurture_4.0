import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String data = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(data);
            writer.close();
            System.out.println("Data has been written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        sc.close();
    }
}
