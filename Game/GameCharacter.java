public abstract class GameCharacter {
    private Player player;
    private String name;
    private int damage;
    private int health;
    private int coin;

    public GameCharacter(String name,int damage, int health, int coin) {
        this.name=name;
        this.damage = damage;
        this.health = health;
        this.coin = coin;
    }
    public  GameCharacter(Player player,String name,int damage, int health, int coin){
        this.player=player; this.name=name;
        this.damage = damage;
        this.health = health;
        this.coin = coin;

        getPlayer().setDamage(getPlayer().getDamage()+getDamage());
        getPlayer().setCoin(getPlayer().getCoin()+getCoin());
        getPlayer().setHealth(getPlayer().getHealth()+getHealth());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void ToString() {
        System.out.println("name=" + name +
                ", damage=" + damage +
                ", health=" + health +
                ", coin=" + coin );
    }
}

class DefaultCharacter extends GameCharacter{

    public DefaultCharacter() {
        super("normal karakter",0, 0,0);
    }
}

 class Knight extends GameCharacter{
    public Knight() {
        super("Knight",8,24,5);
    }

    public Knight(Player player) {
        super(player,"Knight",8,24,5);
    }
}

 class Samurai extends GameCharacter {

    public Samurai() {
        super("Samurai",5,21,15);
    }

    public Samurai(Player player) {
        super(player,"Samurai",5,21,15);
    }
}

class Archer extends GameCharacter {

    public Archer() {
        super("Archer",7,18,20);
    }

    public Archer(Player player) {
        super(player,"Archer",7,18,20);
    }

}

