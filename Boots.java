public class Boots extends PieceOfArmour {

    private String rarity;
    public final String type = "Boots";


    @Override
    public void setRarity(String rarity) {
        if (this.rarity == null){this.rarity = rarity;}
    }

    @Override
    public String getDescription() {
        return "Rarity: " + rarity + "\nType: "  + type;
    }
}

