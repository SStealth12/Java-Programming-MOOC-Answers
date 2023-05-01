
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            int games = 0, wins = 0, losses = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);

                if (team.equals(homeTeam)) {
                    if (homeTeamPoints > visitingTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }

                    games++;
                } else if (team.equals(visitingTeam)) {
                    if (homeTeamPoints > visitingTeamPoints) {
                        losses++;
                    } else {
                        wins++;
                    }

                    games++;
                }
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
