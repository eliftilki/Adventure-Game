public abstract class NormalLocation extends Location{

    public NormalLocation(Player player,String LocationName) {
        super(player,LocationName);
    }

    @Override
    boolean onLocation() {
        return true;
    }
}
