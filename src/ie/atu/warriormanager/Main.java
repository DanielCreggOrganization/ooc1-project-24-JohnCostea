package ie.atu.warriormanager;

public class Main {
    public static void main(String[] args){
        Warrior w1 = new Warrior(101, "Max", 15, 100, true, 50.0);

        System.out.println(w1.getWarriorName() + " has " + w1.getWarriorLife() + " life");
    }
}
