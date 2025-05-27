import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a double to cast it into integer: ");
    double num2 = sc.nextDouble();
    System.out.println("The integer of " + num2 + " is " + (int)num2);
    System.out.println("Enter a Integer to cast it into double: ");
    int num = sc.nextInt();
    System.out.println("The double of " + num + " is " + (double)num);
    sc.close();
    }
}