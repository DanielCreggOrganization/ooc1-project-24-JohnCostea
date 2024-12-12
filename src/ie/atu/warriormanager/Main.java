package ie.atu.warriormanager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //creating warriormanager object
        WarriorManager warriorManagerObject = new WarriorManager();

        int userSelection = 0;
        Scanner userInput = new Scanner(System.in);
        Enemy E1 = new Enemy(102, "Destroyer", 30, 100, true, 80);
        
        while(true){          
            System.out.println("\n#####################################");
            System.out.println("#             My RPG Game            #");
            System.out.println("#              Main Menu             #");
            System.out.println("#####################################\n");
            System.out.println("(1) Create a warrior");
            System.out.println("(2) Show alive warriors");
            System.out.println("(3) Get closer to enemy");
            System.out.println("(4) Distance from enemy");
            System.out.println("(5) Attack enemy");
            System.out.println("(6) Quit");
            System.out.println("Select an option from 1 to 5 and press Enter");
            
            userSelection = userInput.nextInt();           
            if (userSelection == 6){
                userInput.close();
                //Quit
                System.out.println("Game closing... Bye");                
                break;              
            }
            else if (userSelection == 1){
                
                System.out.println("Please enter an ID for your Warrior: ");                  
                int playerId = userInput.nextInt();
                System.out.println("Please enter a name for your Warrior: ");
                String playerName = userInput.next();
                System.out.println("Please enter the damage for your Warrior is going to inflict: ");
                int playerDamage = userInput.nextInt();
                System.out.println("Please enter the total life points for your Warrior: ");
                int playerLife = userInput.nextInt();                
                System.out.println("Please enter the total life points for your Warrior: ");
                double distanceToEnemy = userInput.nextDouble();
                boolean isAlive = true;

                Warrior W1 = new Warrior(playerId, playerName, playerDamage, playerLife, isAlive, distanceToEnemy);
                warriorManagerObject.addWarrior(W1);

            System.out.println("You just added a new warrior with ID"+ W1.getPlayerId() + " and the name " + W1.getPlayerName() + " has " + W1.getPlayerLife() + " life");          
            }// end if
            } //end while                                                                                    
        } // end main
} //end of main class
