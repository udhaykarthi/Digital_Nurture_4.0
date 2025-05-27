import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.print("Enter the number of students: ");
        int count = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("\nEnter an ID to search for the student name: ");
        int searchId = sc.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("No student found with ID: " + searchId);
        }

        sc.close();
    }
}
