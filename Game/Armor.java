public  abstract class Armor {
    private Player player;
    private String name;
    private int Armordamage;

    private int Price;

    public Armor(String name, int Armordamage, int price) {
        this.name = name;
        this.Armordamage = Armordamage;
        this.Price = price;
    }

    public Armor(Player player,String name, int Armordamage, int price) {
        this.name = name;
        this.Armordamage = Armordamage;
        this.Price = price;
        this.player=player;
        this.getPlayer().setDamage(this.getPlayer().getDamage()+getArmordamage());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmordamage() {
        return Armordamage;
    }

    public void setArmordamage(int Armordamage) {
        this.Armordamage = Armordamage;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void ToString() {
        System.out.println("name='" + name +
                ", damage=" + Armordamage +
                ", Price=" + Price);

    }
}
class noArmor extends Armor{

    public noArmor() {
        super("zırh yok",0,0);
    }

}
class hafifArmor extends Armor{

    public hafifArmor() {
        super("Hafif Zırh", 1, 15);
    }

    public hafifArmor(Player player) {
        super(player, "Hafif Zırh", 1, 15);
    }
}

class ortaArmor extends Armor{

    public ortaArmor() {
        super("Orta Zırh", 3, 25);
    }

    public ortaArmor(Player player) {
        super(player, "Orta Zırh", 3, 25);
    }
}

class agirArmor extends Armor{

    public agirArmor() {
        super("Ağır Zırh", 5, 40);
    }

    public agirArmor(Player player) {
        super(player, "Ağır Zırh", 5, 40);
    }
}
