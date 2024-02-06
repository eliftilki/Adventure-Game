import java.util.Scanner;

public class Player  {

    private String name;
    private GameCharacter characterType;

    private  Weapons characterWeapon;
    private Armor characterArmor;
    private int damage;
    private int health;
    private int coin;
    private Scanner scanner=new Scanner(System.in);

    public Player(String name) {

        this.name = name;
        this.characterType=new DefaultCharacter();
        this.characterWeapon=new Yumruk();
        this.characterArmor=new noArmor();
        this.damage=this.characterType.getDamage()+this.characterWeapon.getWeaponDamage()+this.characterArmor.getArmordamage();
        this.health=this.characterType.getHealth();
        this.coin=this.characterType.getCoin();

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCharacter getCharacterType() {
        return characterType;
    }

    public void setCharacterType(GameCharacter characterType) {
        this.characterType = characterType;
    }

    public Weapons getCharacterWeapon() {
        return characterWeapon;
    }

    public void setCharacterWeapon(Weapons characterWeapon) {
        this.characterWeapon = characterWeapon;
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
        if(health<0){
            health=0;
        }
        this.health = health;


    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public Armor getCharacterArmor() {
        return characterArmor;
    }

    public void setCharacterArmor(Armor characterArmor) {
        this.characterArmor = characterArmor;
    }
}
