public class SafeHouse extends NormalLocation{
    public SafeHouse(Player player) {
        super(player,"Güvenli ev");
    }

    @Override
    boolean onLocation() {
        System.out.println("Güvenli evdesiniz.");
        this.getPlayer().setHealth(this.getPlayer().getCharacterType().getHealth());
        System.out.println("Canınız fullendi.");
        return true;
    }
}
