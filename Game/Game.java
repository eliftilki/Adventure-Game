import java.util.Scanner;

public class Game {
    private Scanner scanner=new Scanner(System.in);
    public void start(){
        System.out.println("Macera oyununa hoşgeldiniz.");
        System.out.print("\nkarakter ismini giriniz:");
        String playerName= scanner.nextLine();
        Player player=new Player(playerName);
        System.out.println("Merhaba "+player.getName());
        System.out.println("\nLütfen Karaterinizi Seçiniz.");

        GameCharacter[] characterList={new Samurai(),new Knight(),new Archer()};
        for(int i=0;i<characterList.length;i++){
            System.out.print((i+1)+"-");
            characterList[i].ToString();
        }
        System.out.print("seçtiğiniz karakter:");
        int select= scanner.nextInt();
        if(select==1){
            player.setCharacterType(new Samurai(player));

        }
        if(select==2){
            player.setCharacterType(new Knight(player));
        }
        if(select==3){
            player.setCharacterType(new Archer(player));
        }
        System.out.println("\n"+player.getCharacterType().getName()+" karakterini seçtiniz.");
        Location location=null;
        while(true){

            System.out.println("\nBölgeler");
            System.out.println("1-Güvenli ev");
            System.out.println("2-Store");
            System.out.println("3-Mağara");
            System.out.println("4-Orman");
            System.out.println("5-Nehir");
            System.out.println("0-çıkış");
            System.out.print("Gitmek istediğiniz yeri şeçiniz:");
            int select_location= scanner.nextInt();
            switch (select_location){
                case 0:
                    location=null;
                    break;
                case 1:
                    location=new SafeHouse(player);
                    break;

                case 2:
                    location=new ToolStore(player);
                    break;

                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;

                default:
                    location=new SafeHouse(player);

            }
            if(location==null){
                System.out.println("oyun bitti");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Game Over");
                break;
            }

        }

    }
}
