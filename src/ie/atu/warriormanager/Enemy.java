package ie.atu.warriormanager;

public class Enemy extends Player {
    // Instance variable to store the enemy's stab damage
    private int stabDamage;

    // Constructor to initialize the enemy's properties
    public Enemy(int playerId, String playerName, int playerDamage, int playerLife, boolean isAlive, int stabDamage) {
        // Set the inherited properties from the Player class
        setPlayerId(playerId);          // Set the unique ID for the enemy
        setPlayerName(playerName);      // Set the name of the enemy
        setPlayerDamage(playerDamage);  // Set the base attack damage of the enemy
        setPlayerLife(playerLife);      // Set the life points of the enemy
        setIsAlive(isAlive);            // Set the status if the enemy is alive or not
        this.stabDamage = stabDamage;   // Set the additional stab damage specific to this enemy
    }

    // Getter method to retrieve the enemy's stab damage
    public int getStabDamage() {
        return this.stabDamage;
    }

    // Setter method to modify the enemy's stab damage
    public void setStabDamage(int stabDamage) {
        this.stabDamage = stabDamage; // Update the stab damage value
    }

    // Method to display the enemy's motto when they are introduced or during certain actions
    @Override
    public void sayMotto() {
        System.out.println("You're a dead man!"); // Display the enemy's threatening motto
    }

    // Method to represent the enemy defending themselves
    @Override
    public void defend() {
        System.out.println("Parry a blow!"); // Display the enemy's defense action
    }
}
