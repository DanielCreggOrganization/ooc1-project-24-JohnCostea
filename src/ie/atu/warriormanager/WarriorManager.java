package ie.atu.warriormanager;

public class WarriorManager {
    // Array to store all warrior objects (up to 100 warriors)
    private Warrior[] warriors;

    // Constructor to initialize the warriors array with a size of 100
    public WarriorManager() {
        warriors = new Warrior[100]; // Array to hold the warriors
    }

    // Getter method to retrieve the array of warriors
    public Warrior[] getWarriors() {
        return warriors; // Returns the warriors array
    }

    // Method to add a new warrior to the warriors array
    public void addWarrior(Warrior warrior) {
        // Loop through the warriors array and find the first null spot to add the new warrior
        for (int i = 0; i < warriors.length; i++) {
            if (warriors[i] == null) {
                warriors[i] = warrior; // Assign the warrior to the first available spot
                break; // Exit the loop once the warrior has been added
            }
        }
    }

    // Method to check and display all alive warriors
    public void checkAliveWarriors() {
        boolean foundAlive = false; // Flag to check if any alive warriors are found
        // Loop through all warriors to check their life status
        for (Warrior warrior : warriors) {
            if (warrior != null && warrior.getIsAlive()) {
                // Display the warrior's status if they are alive
                UtilMethods.displayText(warrior.getPlayerName() + " is still alive with " + warrior.getPlayerLife() + " life remaining.", 25);
                foundAlive = true; // Mark that at least one alive warrior is found
            }
        }

        // If no alive warriors are found, display a message
        if (!foundAlive) {
            UtilMethods.displayText("No alive warriors found!", 25);
        }
    }

    // Method to make all alive warriors move closer to the enemy (reduce their distance)
    public void getCloserToEnemy() {
        boolean movedCloser = false; // Flag to check if any warrior moved closer
        // Loop through all warriors to reduce their distance to the enemy
        for (Warrior warrior : warriors) {
            if (warrior != null && warrior.getIsAlive()) {
                // Reduce the distance to the enemy by 10
                warrior.setDistanceToEnemy(warrior.getDistanceToEnemy() - 10);
                // Display the updated distance of the warrior
                UtilMethods.displayText(warrior.getPlayerName() + " moved closer to the enemy. Distance now: " + warrior.getDistanceToEnemy(), 25);
                movedCloser = true; // Mark that a warrior has moved closer
            }
        }

        // If no warriors moved closer, display a message
        if (!movedCloser) {
            UtilMethods.displayText("No warriors available to move closer to the enemy!", 25);
        }
    }

    // Method to handle the attack of warriors on the enemy and the counterattack from the enemy
    public void attackEnemy(Enemy enemy) {
        boolean attackHappened = false; // Flag to check if any attack happened
        // Loop through the warriors array and attack the enemy if the warrior is alive
        for (Warrior warrior : warriors) {
            if (warrior != null && warrior.getIsAlive()) {
                // Reduce the enemy's life based on the warrior's damage
                int remainingEnemyLife = enemy.getPlayerLife() - warrior.getPlayerDamage();
                enemy.setPlayerLife(remainingEnemyLife); // Update the enemy's life

                // Display the warrior's attack on the enemy
                UtilMethods.displayText(warrior.getPlayerName() + " attacked " + enemy.getPlayerName() + " for " + warrior.getPlayerDamage() + " damage.", 25);

                attackHappened = true; // Mark that an attack happened

                // Check if the enemy is defeated
                if (remainingEnemyLife <= 0) {
                    enemy.setIsAlive(false); // Mark the enemy as dead
                    // Display that the enemy has been defeated
                    UtilMethods.displayText("The enemy " + enemy.getPlayerName() + " has been defeated!", 25);
                    break; // Exit the loop as the enemy is defeated
                } else {
                    // Display the enemy's remaining life if not defeated
                    UtilMethods.displayText(enemy.getPlayerName() + "'s remaining life is " + enemy.getPlayerLife(), 25);
                }

                // Enemy counterattacks the warrior
                int remainingWarriorLife = warrior.getPlayerLife() - enemy.getPlayerDamage();
                warrior.setPlayerLife(remainingWarriorLife); // Update the warrior's life

                // Display the enemy's counterattack
                UtilMethods.displayText(enemy.getPlayerName() + " counterattacked " + warrior.getPlayerName() + " for " + enemy.getPlayerDamage() + " damage.", 25);

                // Check if the warrior is defeated
                if (remainingWarriorLife <= 0) {
                    warrior.setIsAlive(false); // Mark the warrior as dead
                    // Display that the warrior has been defeated
                    UtilMethods.displayText(warrior.getPlayerName() + " has been defeated by " + enemy.getPlayerName() + "!", 25);
                } else {
                    // Display the warrior's remaining life if not defeated
                    UtilMethods.displayText(warrior.getPlayerName() + "'s remaining life is " + warrior.getPlayerLife(), 25);
                }
            }
        }

        // If no attacks happened (no alive warriors), display a message
        if (!attackHappened) {
            System.out.println("No warriors are alive to attack the enemy!");
        }
    }
}
