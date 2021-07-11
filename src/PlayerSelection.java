import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlayerSelection {
public static ArrayList<Player> playerList = new ArrayList<Player>();
public static String name,type;
public static int age,runsScored,wickets;


    static void addPlayer() {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the name: ");
            String name = sc.nextLine();

            System.out.println("Enter the age: ");
            int age = sc.nextInt();


            while (true) {
                System.out.println("Enter the type: 1- Spin bowler, 2-Seam bowler, 3-Batsman, 4-Keeper ");
                int typeOption = sc.nextInt();
                if (typeOption == 1) {
                    type = ("Spin Bowler");
                    break;
                } else if (typeOption == 2) {
                    type = ("Seam Bowler");
                    break;
                } else if (typeOption == 3) {
                    type = ("Batsman");
                    break;
                } else if (typeOption == 4) {
                    type = ("Keeper");
                    break;
                }
                else{
                    System.out.println("Invalid option");
                }
            }

            int runsScored;
            System.out.println("Enter the number of runs scored : ");
            runsScored = sc.nextInt();

            int wickets;
            System.out.println("Enter the number of wickets taken : ");
            wickets = sc.nextInt();

            double runRate;
            System.out.println("Enter the run rate : ");
            runRate = sc.nextInt();
            sc.nextLine();

            double strikeRate;
            System.out.println("Enter the run rate : ");
            strikeRate = sc.nextInt();

            Player player = new Player(name, age, type, runsScored, wickets, runRate, strikeRate);
            playerList.add(player);
            break;

        }}


    static void displayBestTwoBatsman() {
        for (int i = playerList.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((playerList.get(j).runsScored) < (playerList.get(j + 1).runsScored)) {
                    Player player = playerList.get(j);
                    playerList.set(j, playerList.get(j + 1));
                    playerList.set(j + 1, player);
                }
            }
        }
        System.out.println("----------Two Best Batsmen----------");
        int count = 0;
        while (count == 2) {
            System.out.println(playerList.get(count).Name);
            count+=1;
        }
    }

    static void displayBestTwoBowlers() {
        for (int i = playerList.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((playerList.get(j).wickets) < (playerList.get(j + 1).wickets)) {
                    Player player = playerList.get(j);
                    playerList.set(j, playerList.get(j + 1));
                    playerList.set(j + 1, player);
                }
            }
        }
        System.out.println("----------Two Best Bowlers----------");
        int count = 0;
        while (count == 2) {
            System.out.println(playerList.get(count).Name);
        }
    }
    static void displayBestKeeper(){
        System.out.println(Arrays.toString(new ArrayList[]{(playerList)}));

    }

    public static void displayMenuOptions() {//main menu to guide the user to choose options
        System.out.println("---------------Main Menu--------------------");
        System.out.println("\t Insert A to Add a player");
        System.out.println("\t Insert B to Display two best batsmen");
        System.out.println("\t Insert C to Display two best bowlers");
        System.out.println("\t Insert D to Display best keeper");
        System.out.println("\t Insert Q to Quit the program");
    }


}
