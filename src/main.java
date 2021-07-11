import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Player player = new Player();
        PlayerSelection.displayMenuOptions();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter menu option:");
            String menuOption= sc.nextLine();
            while(true){
            if (menuOption.equals("a")) {
                PlayerSelection.addPlayer();
                System.out.println("Do you want to continue entering names?(y for yes, n for no):");
                String vaidation = sc.nextLine();
                if (vaidation.equals("y")) {
                    PlayerSelection.addPlayer();
                } else if (vaidation.equals("n")) {
                    break;
                }

            }
            else if (menuOption.equals("b")){
                PlayerSelection.displayBestTwoBatsman();
                break;
            }
            else if (menuOption.equals("c")){
                PlayerSelection.displayBestTwoBowlers();
                break;
            }
            else if (menuOption.equals("d")){
                PlayerSelection.displayBestKeeper();
                break;
            }
            else if (menuOption.equals("q")){
                System.out.println("Program ended!!!");
                break;
            }
            else{
                System.out.println("Invalid option");
            }

        }}

    }
}
