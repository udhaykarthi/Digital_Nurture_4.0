import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int count = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            studentNames.add(name);
        }

        System.out.println("\nList of Students:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        sc.close();
    }
}
