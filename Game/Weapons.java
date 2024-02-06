public abstract class Weapons {
    private Player player;
    private String name;
    private int WeaponDamage;
    private int Price;

    public Weapons( String name, int WeaponDamage, int price) {
        this.name = name;
        this.WeaponDamage = WeaponDamage;
        this.Price = price;
    }
   public Weapons(Player player,String name, int WeaponDamage, int price){
        this.player=player;
       this.name = name;
       this.WeaponDamage = WeaponDamage;
       this.Price = price;
       this.getPlayer().setDamage(this.getPlayer().getDamage()+getWeaponDamage());
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeaponDamage() {
        return WeaponDamage;
    }

    public void setWeaponDamage(int WeaponDamage) {
        this.WeaponDamage = WeaponDamage;
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

    public  void ToString() {
        System.out.println("name='" + name +
                ", damage=" + WeaponDamage +
                ", Price=" + Price);

    }
}
 class Gun extends Weapons{
    public Gun() {
        super("Tabanca", 2, 25);
    }

    public Gun(Player player) {
        super(player,"Tabanca", 2, 25);
    }
}

 class Sword extends Weapons {

    public Sword() {

        super("Kılıç", 3, 35);


    }

    public Sword(Player player) {
        super(player,"Kılıç", 3, 35);
    }
}

 class Rifle extends Weapons{
    public Rifle() {
        super("Tüfek",7, 45);
    }

    public Rifle(Player player) {
        super(player,"Tüfek",7, 45);
    }
}

class Yumruk extends Weapons{
    public Yumruk() {
        super("Yumruk", 1, 0);
    }

    public Yumruk(Player player) {
        super(player, "Yumruk", 1, 0);
    }
}



