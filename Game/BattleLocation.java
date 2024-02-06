import java.util.Random;

public abstract class BattleLocation extends Location{

   private Obstacle obstacle;
   private String award;
   private int obstaclemax;

    public BattleLocation(Player player, String LocationName, Obstacle obstacle, String award,int obstaclemax) {
        super(player, LocationName);
        this.obstacle = obstacle;
        this.award = award;
        this.obstaclemax=obstaclemax;

    }

    @Override
    boolean onLocation() {
        int obsNumber=randomObstacleNum();
        System.out.println("\nkonumunuz:"+this.getLocationName());
        System.out.println("Dikkatlı ol burada "+obsNumber+" tane "+ this.getObstacle().getObstacleName()+" yaşıyor.");

        playerStatus();
        obsStatus();
        System.out.print("S->SAVAŞ || K->KAÇ  :");
        String selectCase=scanner.nextLine().toUpperCase();

        if(selectCase.equals("S")){
            if(Combat(obsNumber)){
               //System.out.println("tebrikler buradaki tüm düşmanları yendiniz.");
                return true;
            }
            else{
                System.out.println("öldünüz");
                return false;
            }

        }
        else{
            return true;
        }

    }

    public boolean Combat(int obsNumber){

        for(int i=1;i<=obsNumber;i++)
        {
            this.getObstacle().setHealt(this.getObstacle().getOriginalhealt());
            playerStatus();
            while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealt()>0)
            {
                System.out.print("V->Vur || K->Kaç  :");
                String selectComat= scanner.nextLine().toUpperCase();
                if(selectComat.equals("V"))
                {
                    System.out.println("Saldırı gerçekleştirdiniz.");
                    this.getObstacle().setHealt(this.getObstacle().getHealt()-this.getPlayer().getDamage());
                    AfterHit(i);
                    if(this.getObstacle().getHealt()>0)
                    {
                        System.out.println("Canavar karşı saldırıda bulundu.");
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-this.getObstacle().getDamage());
                        AfterHit(i);
                    }
                }
                else{
                    return true;
                }
                if(this.getPlayer().getHealth()<=0){

                    return false;
                }
            }
            this.getPlayer().setCoin(this.getPlayer().getCoin()+ this.getObstacle().getAward());
            System.out.println("oyuncunun yeni para miktarı:"+this.getPlayer().getCoin());
            if(i==obsNumber){
                System.out.println("tebrikler buradaki tüm düşmanları yendiniz.");
            }
        }

        return true;
    }

    public void playerStatus(){
        System.out.println("\nOyuncu sağlığı: "+this.getPlayer().getHealth());
        System.out.println("Oyuncu toplam hasarı: "+this.getPlayer().getDamage());
        System.out.println("oyuncu zırhı: "+this.getPlayer().getCharacterArmor().getName());
        System.out.println("oyuncu silahı: "+this.getPlayer().getCharacterWeapon().getName());
        System.out.println("oyuncu parası: "+this.getPlayer().getCoin());
        System.out.println();
    }
    public void obsStatus(){

        System.out.println("Canavar sağlığı: "+this.getObstacle().getHealt());
        System.out.println("Canavar toplam hasarı: "+this.getObstacle().getDamage());
        System.out.println("Canavar ödülü: "+this.getObstacle().getAward());
        System.out.println();

    }

    public void AfterHit(int i){
        System.out.println("Oyuncu sağlığı: "+this.getPlayer().getHealth());
        System.out.println("Oyuncu toplam hasarı: "+this.getPlayer().getDamage());
        System.out.println();
        System.out.println("Canavar"+ i);
        System.out.println("Canavar sağlığı: "+this.getObstacle().getHealt());
        System.out.println("Canavar toplam hasarı: "+this.getObstacle().getDamage());
        System.out.println();
    }

    public int randomObstacleNum(){
        Random r=new Random();
        int random=r.nextInt(this.getObstaclemax())+1;
        return random;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getObstaclemax() {
        return obstaclemax;
    }

    public void setObstaclemax(int obstaclemax) {
        this.obstaclemax = obstaclemax;
    }
}
