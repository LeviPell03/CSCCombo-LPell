import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter in the number of players: ");
		int Players = scan.nextInt();
		Players = new Player[Players];
		System.out.println("Enter in the size of the die: ");
		int sides = scan.nextInt();
		for (int i = 0; i < Players - 1; i++) {
			System.out.println("Enter the name of the player " + (i + 1));
			String myPlayersName = scan.next();
			Players[i] = new Player(PlayersName, sides);
		}

		System.out.println("Start the game ");
		for (int i = 0; i < Players; i++) {
			Players[i].roll();
		}
		decideWinner(Players);
		System.out.println(Players[index].getName());

	}

	public static void decideWinner(Player[] players) {
		for(int i = 0; i < players.length; i ++) {
			for(int j =0; j < players.length; j ++) {
				if(players[i].compareTo(players[i],players[j]) > 0) {
					winner = players[i];
				}
				
				else if (Player.compareTo(players[i],players[j]) > 0 ) {
					winner = players[j];
				}
				
			}
		}

	}
	if(winner|=null)

	}
		System.out.println(winner.getname() + " has won the game");
	}

}
