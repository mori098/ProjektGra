package Items;

public class ManaPot extends Item {
    public ManaPot() {
        super("Mana Pot", 3, true);
    }

    @Override
    public void performAction(Character character) {
        character.regenerateMana(getRandom().nextInt(20));

    }




    }


