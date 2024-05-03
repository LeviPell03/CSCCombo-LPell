import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to DiceGame.");
        System.out.print("Enter the number of sides for the die being used: ");
        int numSides = in.nextInt();

        System.out.print("Enter the number of players: ");
        int numPlayers = in.nextInt();

        List<Player> players = new ArrayList<>();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter the name for player " + i + ": ");
            String name = in.next();
            Die die = new Die(numSides);
            players.add(new Player(name, die));
        }
            System.out.println();
        for (Player player : players) {
            player.getDie().roll();
            System.out.println("Player " + player.getName() + " rolled a " + player.getDie().getValue() + " on a " + player.getDie().getNumSides() + " sided die...");
        }

        int winnerIndex = decideWinner(players);
            System.out.println();
        if (winnerIndex == -1) {
            System.out.println("It's a tie!");
        } else {
            System.out.println(players.get(winnerIndex).getName() + " won the game! They are Victorious!");
        }

        /*
        Here is the extra credit portion for Exam4. I need all the points I can get haha. This prints the results of the roll and the winner to a file called DiceGameOutput.
        It also includes an IOException to print out a nice message rather than have main just throw an exception.
         */
        try (PrintWriter writer = new PrintWriter(new FileWriter("DiceGameOutput.txt"))) {
            for (Player player : players) {
                writer.println("Player " + player.getName() + " rolled a " + player.getDie().getValue() + " on a " + player.getDie().getNumSides() + " sided die...");
            }

            if (winnerIndex != -1) {
                writer.println(players.get(winnerIndex).getName() + " won the game! They are Victorious!");
            } else {
                writer.println("It's a tie!");
            }
        } catch (IOException e) {
            System.out.println("Sorry, there was an error writing to your DiceGameOutput.txt file: " + e.getMessage());
        }
    }
    //Method that passes in the array/list of players, number of sides on the die, the value of the die and prints the winner
    public static int decideWinner(List<Player> players) {
        int maxRoll = 0;
        int winnerIndex = -1;

        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getDie().getValue() > maxRoll) {
                maxRoll = players.get(i).getDie().getValue();
                winnerIndex = i;
            } else if (players.get(i).getDie().getValue() == maxRoll) {
                winnerIndex = -1;
            }
        }

        return winnerIndex;
    }
}