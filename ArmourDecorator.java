public abstract class ArmourDecorator implements Armour {

    protected Armour armour;

    public ArmourDecorator(Armour armour)
    {
        this.armour = armour;
    }

}
