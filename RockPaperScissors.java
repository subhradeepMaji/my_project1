import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String playAgain;

        do {
            System.out.println("Choose one: Rock, Paper, or Scissors");
            String userChoice = scanner.nextLine().trim();

            
            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer chose: " + computerChoice);

            // Determine the result
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
            ) {
                System.out.println("You win!");
            } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Paper")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Rock"))
            ) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("Invalid choice! Please choose Rock, Paper, or Scissors.");
            }

            // Prompt to play again
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.nextLine().trim();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
