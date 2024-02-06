public class Obstacle {
    private int damage;
    private int healt;
    private int Originalhealt;
    private String ObstacleName;
    private int award;

    public Obstacle(String ObstacleName,int damage, int healt,int award) {
        this.ObstacleName=ObstacleName;
        this.damage = damage;
        this.healt = healt;
        this.Originalhealt = healt;
        this.award=award;
    }

    public String getObstacleName() {
        return ObstacleName;
    }

    public void setObstacleName(String obstacleName) {
        ObstacleName = obstacleName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        if(healt<0){
            healt=0;
        }
        this.healt = healt;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOriginalhealt() {
        return Originalhealt;
    }

    public void setOriginalhealt(int originalhealt) {
        Originalhealt = originalhealt;
    }
}

class Zombie extends Obstacle{

    public Zombie() {
        super("Zombi", 3, 10,4);
    }
}

class Vampire extends Obstacle{

    public Vampire() {
        super("Vampir", 4, 14,7);
    }
}

class Bear extends Obstacle{

    public Bear() {
        super("Ayı", 7, 20,12);
    }
}


