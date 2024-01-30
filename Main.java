import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Play play = new Play();
        
        System.out.println("Welcome to Rock Paper Scissors!");
        String choice = "";
        do {
            if (choice.equals("yes"))
                System.out.println("\nOk, lets go again!");

            play.playGame();

            do {
                System.out.print("Do you want to continue playing[Yes/No]: ");
                choice = scanner.nextLine();
                choice = choice.toLowerCase();
            } while (!(choice.equals("yes")) && !(choice.equals("no")));

        } while (choice.equals("yes"));

        scanner.close();
        System.out.println("\nThank you for playing Rock Paper Scissors ^-^");
    }
}