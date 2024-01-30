import java.util.Scanner;
import java.util.Random;

public class Play {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private String[] rps = { "Rock", "Paper", "Scissor" };
    private String[] rps2 = { "rock", "paper", "scissor" };

    private boolean ifInRps(String str) {
        return (str.equals(rps2[0]) || str.equals(rps2[1]) || str.equals(rps2[2]));
    }

    private String getUserChoice() {
        String user;

        do {
            System.out.print("\nEnter your choice[Rock, Paper or Scissor]: ");
            user = scanner.nextLine();
            user = user.toLowerCase();
        } while (!ifInRps(user));

        return user;
    }

    private int getChoiceIndex(String str) {
        int i;

        if (str.equals(rps2[0]))
            i = 0;
        else if (str.equals(rps2[1]))
            i = 1;
        else
            i = 2;

        return i;
    }

    public void playGame() {
        int compIndex = random.nextInt(3);
        String compChoice = rps2[compIndex];
        String userChoice = getUserChoice();
        int userIndex = getChoiceIndex(userChoice);

        System.out.println("You chose " + rps[userIndex] + ", and computer chose " + rps[compIndex]);
        if (userChoice.equals(rps2[0])) {
            if (compChoice.equals(rps2[0]))
                System.out.println("Its a Draw!");
            else if (compChoice.equals(rps2[1]))
                System.out.println("Sorry, you lose!");
            else
                System.out.println("You Win, yay!");
        } else if (userChoice.equals(rps2[1])) {
            if (compChoice.equals(rps2[1]))
                System.out.println("Its a Draw!");
            else if (compChoice.equals(rps2[2]))
                System.out.println("Sorry, you lose!");
            else
                System.out.println("You Win, yay!");
        } else {
            if (compChoice.equals(rps2[2]))
                System.out.println("Its a Draw!");
            else if (compChoice.equals(rps2[1]))
                System.out.println("You Win, yay!");
            else
                System.out.println("Sorry, you lose!");
        }
        System.out.println();
    }
}