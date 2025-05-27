import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;  // Generates number from 1 to 100
        int guess;

        System.out.println("Guess the number (between 1 and 100):");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Enter a number between 1 and 100.");
                continue;
            }

            if (guess == numberToGuess) {
                System.out.println("Correct: " + numberToGuess);
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

    sc.close();
    }
}
