package ie.atu.warriormanager;

public class Warrior {
    //instance variables
    private int warriorId;  //unique ID
    private String warriorName;
    private String warriorType;
    private int warriorDamage;
    private int warriorLife;
    private boolean isAlive;
    private double distanceToEnemy;

    //constructor
    public  Warrior(int warriorId, String warriorName, String warriorType, int warriorDamage, int warriorLife, boolean isAlive, double distanceToEnemy){
        this.warriorId = warriorId;
        this.warriorName = warriorName;
        this.warriorType = warriorType;
        this.warriorDamage = warriorDamage;
        this.warriorLife = warriorLife;
        this.isAlive = isAlive;
        this.distanceToEnemy = distanceToEnemy;
    }

    //getter and setter Methods
    public int getWarriorId(){
        return this.warriorId;
    }
    public String getWarriorName(){
        return this.warriorName;
    }
    public String getWarriorType(){
        return this.warriorType;
    }
    public int getWarriorDamage(){
        return this.warriorDamage;
    }
    public int getWarriorLife(){
        return this.warriorLife;
    }
    public boolean getIsAlive(){
        return this.isAlive;
    }
    public double getDistanceToEnemy(){
        return this.distanceToEnemy;
    }

    public void setWarriorId(){
        this.warriorId = warriorId;
    }
    public void setWarriorName(){
        this.warriorName = warriorName;
    }
    public void setWarriorType(){
        this.warriorType = warriorType;
    }
    public void setWarriorDamage(){
        this.warriorDamage = warriorDamage;
    }
    public void setWarriorLife(){
        this.warriorLife = warriorLife;
    }
    public void setIsAlive(){
        this.isAlive = isAlive;
    }
    public void setDistanceToEnemy(){
        this.distanceToEnemy = distanceToEnemy;
    }


}
