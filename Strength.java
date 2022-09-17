public class Strength extends ArmourDecorator{

    public Strength(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + "\n+5 Strength";
    }


}
