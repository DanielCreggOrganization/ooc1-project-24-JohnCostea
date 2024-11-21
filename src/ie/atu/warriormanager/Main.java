package ie.atu.warriormanager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int userSelection = 0;
        Scanner userInput = new Scanner(System.in);

        Warrior w1 = new Warrior(101, "Max", 15, 100, true, 50.0);

        System.out.println(w1.getWarriorName() + " has " + w1.getWarriorLife() + " life");

        while(true){
            System.out.println("\n#####################################");
            System.out.println("#             My RPG Game            #");
            System.out.println("#####################################\n");
            System.out.println("(1) Create a warrior");
            System.out.println("(2) Get closer to enemy");
            System.out.println("(3) Distance from enemy");
            System.out.println("(4) Attack enemy");
            System.out.println("(5) Quit");
            System.out.println("Select an option from 1 to 5 and press Enter");
            userSelection = userInput.nextInt();

            if (userSelection == 5){
                //Quit
                System.out.println("Game closing... Bye");
                userInput.close();
                break;                
            }// end if
        } //end while
    } // end main
} //end of main class
