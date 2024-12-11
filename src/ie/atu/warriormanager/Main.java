package ie.atu.warriormanager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int userSelection = 0;
        ArraysClass aco = new ArraysClass();
        Scanner userInput = new Scanner(System.in);
        Enemy E1 = new Enemy(102, "Destroyer", 30, 100, true, 80);
        
        while(true){          
            System.out.println("\n#####################################");
            System.out.println("#             My RPG Game            #");
            System.out.println("#              Main Menu             #");
            System.out.println("#####################################\n");
            System.out.println("(1) Create a warrior");
            System.out.println("(1) Show alive warriors");
            System.out.println("(2) Get closer to enemy");
            System.out.println("(3) Distance from enemy");
            System.out.println("(4) Attack enemy");
            System.out.println("(5) Quit");
            System.out.println("Select an option from 1 to 5 and press Enter");
            
            userSelection = userInput.nextInt();           
            if (userSelection == 5){
                userInput.close();
                //Quit
                System.out.println("Game closing... Bye");                
                break;
                
            }
            else if (userSelection == 1){
                Warrior W1 = new Warrior();
                System.out.println("Please enter a name for your Warrior: ");
                        Scanner userName = new Scanner(System.in);       
                            String userNameChoice = userName.nextLine();                   
                                W1.setPlayerName(userNameChoice);
                                userName.close();
                                
                        Scanner userLife = new Scanner(System.in);
                            int userChoiceLife = userLife.nextInt();
                                W1.setPlayerLife(userChoiceLife);
                                userLife.close();

                        System.out.println(W1.getPlayerName() + " has " + W1.getPlayerLife() + " life");

                                break;          
                                }// end if
                } //end while                                                                                    
        } // end main
} //end of main class
