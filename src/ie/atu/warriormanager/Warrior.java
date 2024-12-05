package ie.atu.warriormanager;

public class Warrior extends Player{
    //instance variables
        private double distanceToEnemy;

    //constructor
    public  Warrior(int playerId, String playerName, int playerDamage, int playerLife, boolean isAlive, double distanceToEnemy){
        this.distanceToEnemy = distanceToEnemy;
    }

    //getters and setters
    public double getDistanceToEnemy(){
        return this.distanceToEnemy;
    }
    public void setDistanceToEnemy(){
        this.distanceToEnemy = distanceToEnemy;
    }
}
