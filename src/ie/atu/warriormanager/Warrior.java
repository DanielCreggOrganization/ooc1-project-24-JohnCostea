package ie.atu.warriormanager;

public class Warrior extends Player {
    // Instance variable to store the distance between the warrior and the enemy
    private double distanceToEnemy;

    // Default constructor
    public Warrior() {
        // No specific initialization needed in this constructor
    }

    // Parameterized constructor to initialize the warrior with specific values
    public Warrior(int playerId, String playerName, int playerDamage, int playerLife, boolean isAlive, double distanceToEnemy) {
        // Initialize the warrior's distance to the enemy
        this.distanceToEnemy = distanceToEnemy;
        // Other player attributes (playerId, playerName, etc.) are inherited from the Player class
    }

    // Getter method to retrieve the warrior's distance to the enemy
    public double getDistanceToEnemy() {
        return this.distanceToEnemy;
    }

    // Setter method to set the warrior's distance to the enemy
    public void setDistanceToEnemy(double distanceToEnemy) {
        this.distanceToEnemy = distanceToEnemy;
    }

    // Overridden method from the Player class that displays the warrior's motto
    @Override
    public void sayMotto() {
        // Display the warrior's motto with a typing effect
        UtilMethods.displayText("I'll destroy my foes!!!", 25);
    }

    // Overridden method from the Player class that displays the warrior's defense action
    @Override
    public void defend() {
        // Display the defense action of the warrior with a typing effect
        UtilMethods.displayText("Taking out a shield!!", 25);
    }
}
