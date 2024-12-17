package ie.atu.warriormanager;

public class Warrior extends Player{
    //instance variables
        private double distanceToEnemy;

    //constructors
    public Warrior(){       
    }   
    public  Warrior(int playerId, String playerName, int playerDamage, int playerLife, boolean isAlive, double distanceToEnemy){
        this.distanceToEnemy = distanceToEnemy;
    }

    //getters and setters
    public double getDistanceToEnemy(){
        return this.distanceToEnemy;
    }
    public void setDistanceToEnemy(double distanceToEnemy){
        this.distanceToEnemy = distanceToEnemy;
    }

    public void sayMotto(){
        System.out.println("I'll kill you!!!");
    }
    
    public void defend(){
        System.out.println("Taking out a shield!!");
    }
}
