package Start_Package;

import Home_Package.Diamond_level;
import Home_Package.Gold_level;
import Home_Package.Player;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player P;

        System.out.println("Enter the information of Golden Level player: \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter Player id: ");
        int id = scanner.nextInt();
        System.out.println("Enter number of kill: ");
        int kill = scanner.nextInt();
        System.out.println("Enter number of gold: ");
        int gold = scanner.nextInt();
        int score = 0;

        P = new Gold_level(name,id,score,kill,gold);

        P.print_info();

        System.out.println("For Special Reward: \nEnter increment rate: ");
        int rates = scanner.nextInt();

        try
        {
            Special_Reward.increase_score(P,rates);
        } catch (IncreaseException e) {

            System.out.println(e);
        }


        Player P1;

        System.out.println("Enter the information of Diamond Level player: \n");
        Scanner scannerr = new Scanner(System.in);
        System.out.println("Enter name: ");
        String namee = scannerr.next();
        System.out.println("Enter Player id: ");
        int idd = scannerr.nextInt();
        System.out.println("Enter number of kill: ");
        int killl = scannerr.nextInt();
        System.out.println("Enter number of diamond: ");
        int diamond = scannerr.nextInt();
        int scoree = 0;

        P1 = new Diamond_level(namee,idd,scoree,killl,diamond);
        P1.print_info();

        System.out.println("For Special Reward: \nEnter increment rate: ");
        int ratess = scannerr.nextInt();
        System.out.println("Enter Score limit: ");
        int limit = scannerr.nextInt();

        try
        {
            Special_Reward.increase_score(P1,rates,limit);
        } catch (IncreaseException e) {

            System.out.println(e);
        }


    }
}