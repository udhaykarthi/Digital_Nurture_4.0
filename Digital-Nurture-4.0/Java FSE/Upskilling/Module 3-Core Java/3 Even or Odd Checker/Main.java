import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numebr to check even or odd: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        sc.close();
    }
}