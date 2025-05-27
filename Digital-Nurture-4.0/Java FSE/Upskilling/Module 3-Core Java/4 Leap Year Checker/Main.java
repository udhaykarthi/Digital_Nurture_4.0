import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Year to check if it is a leap year or not");
    int year = sc.nextInt();
    boolean leap = false;
    if(year % 4 == 0) {
        if( year % 100 == 0) {
            if ( year % 400 == 0)
                leap = true;
            else
                leap = false;       
            }
        else leap = true;
        }
        if(leap) System.out.println(year + " is a leap year.");
        else System.out.println(year + " is not a leap year.");  
            sc.close();
    }
}