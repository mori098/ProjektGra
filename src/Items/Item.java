package Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Item {

    public static List<Item> itemsList = new ArrayList<>();
    static{
        itemsList.add(new HpPot());

    }

    private String name;
    private int weight;
    private boolean hasAction;
    private Random random;

    public Item(String name, int weight, boolean hasAction){
        this.name = name;
        this.weight = weight;
        this.hasAction = hasAction;
        random = new Random();

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasAction() {
        return hasAction;
    }

    public void setHasAction(boolean hasAction) {
        this.hasAction = hasAction;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public abstract void performAction(Character character);
}
