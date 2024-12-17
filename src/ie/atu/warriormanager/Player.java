package ie.atu.warriormanager;

public abstract class Player {
    // Instance variables for the player's unique attributes
    private int playerId;  // Unique ID for the player
    private String playerName;  // Name of the player
    private int playerDamage;  // Amount of damage the player can inflict
    private int playerLife;  // Health points of the player
    private boolean isAlive;  // Boolean to check if the player is alive

    // Getter methods to access the player's attributes
    public int getPlayerId(){
        return this.playerId;  // Return the unique ID of the player
    }                                                                                                                                                                  
    public String getPlayerName(){
        return this.playerName;  // Return the player's name
    }
    public int getPlayerDamage(){
        return this.playerDamage;  // Return the damage the player can deal
    }
    public int getPlayerLife(){
        return this.playerLife;  // Return the player's life (health points)
    }
    public boolean getIsAlive(){
        return this.isAlive;  // Return the status of the player (alive or dead)
    }

    // Setter methods to modify the player's attributes
    public void setPlayerId(int playerId){
        this.playerId = playerId;  // Set the unique ID for the player
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;  // Set the player's name
    }
    public void setPlayerDamage(int playerDamage){
        this.playerDamage = playerDamage;  // Set the amount of damage the player can deal
    }
    public void setPlayerLife(int playerLife){
        this.playerLife = playerLife;  // Set the player's life (health points)
    }
    public void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;  // Set whether the player is alive or dead
    }

    // Abstract method to be implemented by subclasses (like Warrior, Enemy)
    public abstract void sayMotto();  // This method will be overridden in subclasses to define each player's motto

    // A default method for defending an attack
    public void defend(){
        System.out.println("The player tried to shield the attack");  // Prints a message when the player defends
    }
}
