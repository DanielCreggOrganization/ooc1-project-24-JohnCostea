package ie.atu.warriormanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a new WarriorManager instance to manage the warriors in the game
        WarriorManager warriorManager = new WarriorManager();

        // Initializing an enemy instance with properties such as ID, name, damage, life, and stab damage
        Enemy enemy = new Enemy(1, "Kraven", 30, 100, true, 50);

        // Scanner object to take user input from the console
        Scanner userInput = new Scanner(System.in);

        // Infinite loop to keep the menu running until the user chooses to quit
        while (true) {
            System.out.println("\n#####################################");
            System.out.println("#             My RPG Game            #");
            System.out.println("#              Main Menu             #");
            System.out.println("#####################################\n");

            // Displaying the menu options for the user
            System.out.println("(1) Create a warrior");
            System.out.println("(2) Show alive warriors");
            System.out.println("(3) Get closer to enemy");
            System.out.println("(4) Attack enemy");
            System.out.println("(5) Quit");
            System.out.println("Select an option from 1 to 5 and press Enter");

            // Reading the user's selection
            int userSelection = userInput.nextInt();

            // Using a switch statement to handle the user's menu selection
            switch (userSelection) {
                case 1: // If the user selects option 1, create a new warrior
                    createWarrior(userInput, warriorManager); // Method to create a new warrior
                    // Displaying enemy information after the warrior is created
                    UtilMethods.displayText("I have to defeat " + enemy.getPlayerName() + 
                        " which can damage me by " + enemy.getPlayerDamage() + 
                        " and also can stab me with " + enemy.getStabDamage() + " damage..", 25);
                    break;
                case 2: // If the user selects option 2, show alive warriors
                    warriorManager.checkAliveWarriors(); // Method to display all alive warriors
                    break;
                case 3: // If the user selects option 3, get closer to the enemy
                    warriorManager.getCloserToEnemy(); // Method to make warriors get closer to the enemy
                    break;
                case 4: // If the user selects option 4, attack the enemy
                    warriorManager.attackEnemy(enemy);  // Calling the attackEnemy method from WarriorManager
                    break;
                case 5: // If the user selects option 5, quit the game
                    UtilMethods.displayText("Game closing... Bye", 25); // Display message before quitting
                    userInput.close(); // Close the Scanner object to prevent resource leak
                    return; // Exit the main loop and end the program
                default: // If the user enters an invalid selection
                    UtilMethods.displayText("Invalid choice! Please select a valid option.", 25); // Show error message
            }
        }
    }

    // Method to create a new warrior by gathering input from the user
    private static void createWarrior(Scanner userInput, WarriorManager warriorManager) {
        Warrior warrior = new Warrior(); // Create a new instance of Warrior

        // Asking for the warrior's ID and setting it
        UtilMethods.displayText("Enter ID for your Warrior:", 25);
        warrior.setPlayerId(userInput.nextInt());

        // Asking for the warrior's name and setting it
        UtilMethods.displayText("Enter name for your Warrior:", 25);
        warrior.setPlayerName(userInput.next());

        // Asking for the warrior's damage and setting it
        UtilMethods.displayText("Enter damage you want " + warrior.getPlayerName() + " to inflict:", 25);
        warrior.setPlayerDamage(userInput.nextInt());

        // Setting default values for the warrior's health, distance to enemy, and status
        warrior.setPlayerLife(100);  // Setting the warrior's life to 100
        warrior.setDistanceToEnemy(120.0); // Setting the distance from the enemy to 120 meters
        warrior.setIsAlive(true); // The warrior is alive when created

        // Adding the newly created warrior to the WarriorManager
        warriorManager.addWarrior(warrior);

        // Displaying a message to confirm the warrior creation
        UtilMethods.displayText("New warrior created with the name " + warrior.getPlayerName() + 
            " with ID: " + warrior.getPlayerId(), 25);

        // Using the overridden sayMotto method to display the warrior's motto
        warrior.sayMotto();
    }   
}
