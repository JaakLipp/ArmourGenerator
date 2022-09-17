public class Intelligence extends ArmourDecorator{

    public Intelligence(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + "\n+5 Intelligence";
    }



}
