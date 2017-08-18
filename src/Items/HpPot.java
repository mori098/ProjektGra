package Items;

public class HpPot extends Item {

    public HpPot(String name, int weight, boolean hasAction) {
        super(name, weight, hasAction);
    }

    @Override
    public void performAction(Player player) {

        player.healPlayer(getRandom().nextInt());
    }
}
