public class Runner {



    public static void main(String[] args)
    {
        ArmourFactory factory = new DefaultArmourDrop();

        Armour myPiece = factory.getArmour();



        System.out.println(myPiece.getDescription());
    }
}
