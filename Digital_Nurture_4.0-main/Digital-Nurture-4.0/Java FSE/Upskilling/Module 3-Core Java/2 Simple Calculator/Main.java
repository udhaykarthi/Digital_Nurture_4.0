import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b =  sc.nextInt();
        System.out.println("Enter the Operation you want to perform (+,-,*,/) :");
        int op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(a ==0 || b == 0) System.out.println("Invalid operands");
                else System.out.println((double)a/b);
                break;
            default:
                System.out.println("Not a valid Operator");
                break;
        }
        sc.close();
    }
}