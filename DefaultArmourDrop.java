import java.util.*;

public class DefaultArmourDrop implements ArmourFactory{

    private Random random = new Random();

    PieceOfArmour armour;

    private PieceOfArmour[] types = {new Helmet(), new ChestPiece(), new Gloves(), new Boots()};
    private String[] rarities = {"Common", "Uncommon", "Rare", "Epic"};

    private int numberOfAttributes = 3;

    //decorates the armour piece with attributes
    private Armour getAttributes(Armour armour, int attributesLeft)
    {
        for (int i = attributesLeft + 1; i > 0; i--)
        {
            int randomAttribute = random.nextInt(0,numberOfAttributes);

            switch (randomAttribute) {
                case 0 -> armour = new Intelligence(armour);
                case 1 -> armour = new Strength(armour);
                case 2 -> armour = new Dexterity(armour);
            }
        }
        return armour;
    }


    @Override
    public Armour getArmour() {


        int randomType = random.nextInt(0, types.length);
        int randomRarity = random.nextInt(0, rarities.length);

        armour = types[randomType];
        armour.setRarity(rarities[randomRarity]);


        return getAttributes(armour, randomRarity);


    }


}
