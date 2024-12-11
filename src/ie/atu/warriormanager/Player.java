package ie.atu.warriormanager;

public abstract class Player {
    //instance variables
    private int playerId;  //unique ID
    private String playerName;
    private int playerDamage;
    private int playerLife;
    private boolean isAlive;

    //getter and setter Methods
    public int getPlayerId(){
        return this.playerId;
    }                                                                                                                                                                  
    public String getPlayerName(){
        return this.playerName;
    }
    public int getPlayerDamage(){
        return this.playerDamage;
    }
    public int getPlayerLife(){
        return this.playerLife;
    }
    public boolean getIsAlive(){
        return this.isAlive;
    }

    public void setPlayerId(){
        this.playerId = playerId;
    }
    public void setPlayerName(){
        this.playerName = playerName;
    }
    public void setPlayerDamage(){
        this.playerDamage = playerDamage;
    }
    public void setPlayerLife(){
        this.playerId = playerLife;
    }
    public void setIsAlive(){
        this.isAlive = isAlive;
    }

    public abstract void sayMotto();
    
    public void defend(){
        System.out.println("Please leave me alone!!");
    }

}
