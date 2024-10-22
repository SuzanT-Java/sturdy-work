import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String rps[] = {"Rock", "Paper", "Scissor"};
            String computerSelect = rps[new Random().nextInt(rps.length)];
            String playerMove;

            while (true) {
                System.out.println("Enter either Rock, Paper, or Scissor: ");
                playerMove = scanner.nextLine();
                if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissor")) {
                    break;
                }
                System.out.println("The value entered was not a valid move! Try again");
            }

            System.out.println(computerSelect + " was the computer's move!");

            if (playerMove.equals(computerSelect)) {
                System.out.println("It looks like it is a tie!");
            }

            if (playerMove.equals("Rock")) {
                if (computerSelect.equals("Paper")) {
                    System.out.println("You Lose!");
                } else if (computerSelect.equals("Scissor")) {
                    System.out.println("You Won!");
                }
            }
            if (playerMove.equals("Paper")) {
                if (computerSelect.equals("Scissor")) {
                    System.out.println("You Lose!");
                } else if (computerSelect.equals("Rock")) {
                    System.out.println("You Won!");
                }
            }
            if (playerMove.equals("Scissor")) {
                if (computerSelect.equals("Rock")) {
                    System.out.println("You Lose!");
                } else if (computerSelect.equals("Paper")) {
                    System.out.println("You Won!");
                }
            }

            System.out.println("Do you want to keep playing? Yes or No");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("Yes")){
                break;
            }
        }
    }
}