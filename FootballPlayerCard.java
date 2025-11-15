import java.util.Random;
import java.util.Scanner;

public class FootballPlayerCard {
    
    static String[] players = {
            "Paul Scholes | Central Midfielder | Right Footed | Offense: 87 | Defense: 73",
            "Lionel Messi | Right Wing Forward | Left Footed | Offense: 97 | Defense: 50",
            "Sergio Ramos | Center Back | Right Footed | Offense: 75 | Defense: 90",
            "Cristiano Ronaldo | Left Wing Forward | Right Footed | Offense: 98 | Defense: 65",
            "N'Golo Kanté | Defensive Midfielder | Right Footed | Offense: 70 | Defense: 88",
            "Zinedine Zidane | Attacking Midfielder | Right Footed | Offense: 90 | Defense: 70",
            "Manuel Neuer | Goalkeeper | Right Footed | Offense: 40 | Defense: 95",
            "Gianluigi Buffon | Goalkeeper | Right Footed | Offense: 35 | Defense: 92",
            "Ronaldinho | Attacking Midfielder | Right Footed | Offense: 92 | Defense: 55",
            "Paolo Maldini | Left Back | Left Footed | Offense: 65 | Defense: 95",
            "David Beckham | Right Midfielder | Right Footed | Offense: 80 | Defense: 72",
            "Thierry Henry | Left Wing Forward | Right Footed | Offense: 91 | Defense: 55",
            "Andrea Pirlo | Deep-Lying Playmaker | Right Footed | Offense: 85 | Defense: 65",
            "Javier Zanetti | Right Back | Right Footed | Offense: 68 | Defense: 90",
            "Iker Casillas | Goalkeeper | Right Footed | Offense: 35 | Defense: 90",
            "Roberto Carlos | Left Back | Left Footed | Offense: 78 | Defense: 85",
            "Francesco Totti | Attacking Midfielder | Right Footed | Offense: 88 | Defense: 50",
            "Xavi Hernandez | Central Midfielder | Right Footed | Offense: 85 | Defense: 70",
            "Frank Lampard | Central Midfielder | Right Footed | Offense: 86 | Defense: 68",
            "Didier Drogba | Center Forward | Right Footed | Offense: 89 | Defense: 60",
            "Steven Gerrard | Central Midfielder | Right Footed | Offense: 82 | Defense: 75",
            "Alessandro Nesta | Center Back | Right Footed | Offense: 60 | Defense: 90",
            "Rivaldo | Attacking Midfielder | Left Footed | Offense: 90 | Defense: 50",
            "Petr Čech | Goalkeeper | Right Footed | Offense: 30 | Defense: 91",
            "Ruud van Nistelrooy | Center Forward | Right Footed | Offense: 88 | Defense: 50",
            "Philipp Lahm | Right Back | Right Footed | Offense: 72 | Defense: 85",
            "Fernando Torres | Center Forward | Right Footed | Offense: 85 | Defense: 55",
            "Xabi Alonso | Deep-Lying Playmaker | Right Footed | Offense: 82 | Defense: 77",
            "Rio Ferdinand | Center Back | Right Footed | Offense: 65 | Defense: 88",
            "Cafu | Right Back | Right Footed | Offense: 75 | Defense: 85",
            "Gareth Bale | Right Wing Forward | Left Footed | Offense: 90 | Defense: 60",
            "Claude Makélélé | Defensive Midfielder | Right Footed | Offense: 65 | Defense: 85",
            "Marcelo | Left Back | Left Footed | Offense: 80 | Defense: 70",
            "Kylian Mbappé | Left Wing Forward | Right Footed | Offense: 94 | Defense: 55",
            "Erling Haaland | Center Forward | Left Footed | Offense: 93 | Defense: 50",
            "Kevin De Bruyne | Attacking Midfielder | Right Footed | Offense: 91 | Defense: 60",
            "Virgil van Dijk | Center Back | Right Footed | Offense: 65 | Defense: 93",
            "Alisson Becker | Goalkeeper | Right Footed | Offense: 35 | Defense: 90",
            "Robert Lewandowski | Center Forward | Right Footed | Offense: 92 | Defense: 50",
            "Mohamed Salah | Right Wing Forward | Left Footed | Offense: 90 | Defense: 50",
            "Trent Alexander-Arnold | Right Back | Right Footed | Offense: 85 | Defense: 70",
            "Jude Bellingham | Central Midfielder | Right Footed | Offense: 85 | Defense: 75",
            "Zlatan Ibrahimović | Center Forward | Right Footed | Offense: 90 | Defense: 50",
            "Sadio Mané | Left Wing Forward | Right Footed | Offense: 88 | Defense: 60",
            "Eden Hazard | Left Wing Forward | Right Footed | Offense: 89 | Defense: 50",
            "Sergio Agüero | Center Forward | Right Footed | Offense: 91 | Defense: 45",
            "Toni Kroos | Central Midfielder | Right Footed | Offense: 85 | Defense: 70",
            "Gerard Piqué | Center Back | Right Footed | Offense: 65 | Defense: 88",
            "Marc-André ter Stegen | Goalkeeper | Right Footed | Offense: 30 | Defense: 90",
            "Luka Modrić | Central Midfielder | Right Footed | Offense: 87 | Defense: 70",
            "Raheem Sterling | Right Wing Forward | Right Footed | Offense: 85 | Defense: 50",
            "Giorgio Chiellini | Center Back | Left Footed | Offense: 60 | Defense: 90"

        };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String input = "";

        
        String[] drawnPlayers = new String[100];
        int count = 0;

        System.out.println("Welcome to the football card draw!");
        System.out.println("Game rule: Type 'draw' to draw a player or 'end' to finish.\n");

        count = playGame(scanner, players, drawnPlayers, count, random);

        displayPlayerCards(drawnPlayers, count);

        System.out.println("\nThanks for playing!");
        scanner.close();
    }

    public static int playGame(Scanner scanner, String[] players, String[] drawnPlayers, int count, Random random) {
        String input;
        
        while (true) {
            System.out.println("Type 'draw' to get random players, or type 'end' to end game:");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("draw")) {
                String drawnPlayer = players[random.nextInt(players.length)];
                System.out.println("\nCongratulations on obtaining: " + drawnPlayer + "\n");
                
                if (count < drawnPlayers.length) {
                    drawnPlayers[count] = drawnPlayer;
                    count++;
                } else {
                    System.out.println("You have reached the maximum number of drawn players.");
                }
            } else if (input.equalsIgnoreCase("end")) {
                System.out.println("\nGame over.");
                System.out.println("\nHere is your current lineup:");
                break;
            } else {
                System.out.println("Invalid input, please enter 'draw' or 'end'.");
            }
        }
        return count;
    }

    public static void displayPlayerCards(String[] drawnPlayers, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(drawnPlayers[i]);
        }
    }
}