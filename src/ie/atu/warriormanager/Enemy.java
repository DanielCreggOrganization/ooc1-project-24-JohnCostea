package ie.atu.warriormanager;

public class Enemy extends Player{
    //instance variables
    private int stabDamage;

    //constructor
    public Enemy(int playerId, String playerName, int playerDamage, int playerLife, boolean isAlive,int stabDamage ){
        this.stabDamage = stabDamage;
    }

    //getters and setters
    public int getStabDamage(){
        return this.stabDamage;
    }
    public void setStabDamage(){
        this.stabDamage = stabDamage ;
    }

    public void sayMotto(){
        System.out.println("You're a dead man");
    }

    public void defend(){
        System.out.println("Parry a blow");
    }
}
