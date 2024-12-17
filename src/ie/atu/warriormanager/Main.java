package ie.atu.warriormanager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //creating warriormanager object
        WarriorManager warriorManagerObject = new WarriorManager();

        int userSelection = 0;
        Scanner userInput = new Scanner(System.in);
        Enemy E1 = new Enemy(999, "Destroyer", 30, 100, true, 80);
        
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
                Warrior W1 = new Warrior();
                
                System.out.println("Please enter an ID number for your Warrior: ");
                W1.setPlayerId(userInput.nextInt());                

                System.out.println("Please enter a name for your Warrior: ");
                W1.setPlayerName(userInput.next());  
                
                System.out.println("Please enter the damage " + W1.getPlayerName() + " is going to inflict to the enemy: ");
                W1.setPlayerDamage(userInput.nextInt());
                W1.setPlayerLife(100);
                W1.setDistanceToEnemy(120.00);
                W1.setIsAlive(true);
                
                //Warrior W1 = new Warrior(W1.getPlayerId(), W1.getPlayerName(), W1.getPlayerDamage(), W1.getPlayerLife(), W1.getIsAlive(), W1.getDistanceToEnemy());
                
                warriorManagerObject.addWarrior(W1);

                System.out.println("You just added a new warrior with ID "+ W1.getPlayerId() + " and the name " + W1.getPlayerName() + ". He has " + W1.getPlayerDamage() + " damage " + " and a distance to the enemy of " + W1.getDistanceToEnemy() +" metres.");          
                }
                else if (userSelection == 2){
                    //WarriorManager.checkAliveWarriors();
                    WarriorManager.totalWarriors();
                }
                // end if
            } //end while                                                                                    
        } // end main
} //end of main class
