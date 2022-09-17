public class Dexterity extends ArmourDecorator{

    public Dexterity(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + "\n+5 Dexterity";
    }



}

