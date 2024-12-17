package ie.atu.warriormanager;

public class WarriorManager {
    //creating an oject array to store the warriors created
    private static Warrior[] warriors;
    
        //constructor
        public WarriorManager(){
            warriors = new Warrior[100];
        }
    
        //getters and setters
        public Warrior[] getWarrior(){
            return warriors;
        } 
        public void setWarrior(Warrior[] warriors){
            this.warriors = warriors;
        }
    
        public void addWarrior(Warrior warrior){
        //loop throughg the array to find firsst empty slot
            for (int i = 0; i < warriors.length; i++){
            //check if the slot is empty
                if(warriors[i] == null){
                    //adding warrior object to the array
                    warriors[i] = warrior;
                    // exit loop
                break;
                }
             }
        }
    
        // method to find the total of warriors in the array
        public static int totalWarriors(){
            //initialize counter
            int total = 0;
            //loop through the array
            for (int i=0; i < warriors.length; i++){
                //check if the slot is empty
                if(warriors[i] != null){
                    //increment counter
                    total++;
                }               
            }
            System.out.println("Total Warriors created: "+ total);
            // return total number of warriors
            return total;
            
        }
    
        public static void checkAliveWarriors(){
            for (Warrior warriors : warriors){
            if ((warriors.getIsAlive() == true)){
                System.out.println(warriors.getPlayerName() + " is still alive.");
            }         
        }
    }
}
