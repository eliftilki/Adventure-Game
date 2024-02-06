public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player,"Mağaza");
    }

    @Override
    boolean onLocation() {

        while(true) {
            System.out.println("\nMağazaya Hoşgeldiniz.");
            System.out.println("1-Silahlar");
            System.out.println("2-Zırhlar");
            System.out.println("3-çıkış");
            System.out.print("Seçim:");

            int selectItem= scanner.nextInt();
            while(selectItem<1 || selectItem>3){
                System.out.print("Geçersiz değer. Tekrar giriniz:");
                selectItem= scanner.nextInt();
            }
            if (selectItem == 1) {
                System.out.println("\nSilahlar");
                Weapons[] weaponList = {new Sword(), new Rifle(), new Gun()};
                for (int i = 0; i < weaponList.length; i++) {
                    System.out.print((i + 1) + "-");
                    weaponList[i].ToString();
                }
                System.out.print("Bir silah seçiniz:");
                int selectWeapon = scanner.nextInt();
                while (selectWeapon < 1 || selectWeapon > 3) {
                    System.out.print("Geçersiz değer. Tekrar giriniz:");
                    selectWeapon = scanner.nextInt();
                }
                if (selectWeapon == 1) {
                    if (this.getPlayer().getCoin() > new Sword().getPrice()) {
                        this.getPlayer().setCoin(this.getPlayer().getCoin() - new Sword().getPrice());
                        this.getPlayer().setCharacterWeapon(new Sword(this.getPlayer()));
                        System.out.println(this.getPlayer().getCharacterWeapon().getName() + " silahını seçtiniz.");
                    } else {
                        System.out.println("Yetersiz bakiye");
                        System.out.println("Bakiyeniz:" + this.getPlayer().getCoin());
                    }

                }
                if (selectWeapon == 2) {
                    if (this.getPlayer().getCoin() > new Rifle().getPrice()) {
                        this.getPlayer().setCoin(this.getPlayer().getCoin() - new Rifle().getPrice());
                        this.getPlayer().setCharacterWeapon(new Rifle(this.getPlayer()));
                        System.out.println(this.getPlayer().getCharacterWeapon().getName() + " silahını seçtiniz.");
                    } else {
                        System.out.println("Yetersiz bakiye");
                        System.out.println("Bakiyeniz:" + this.getPlayer().getCoin());

                    }

                }
                if (selectWeapon == 3) {

                    if (this.getPlayer().getCoin() > new Gun().getPrice()) {

                        this.getPlayer().setCoin(this.getPlayer().getCoin() - new Gun().getPrice());
                        this.getPlayer().setCharacterWeapon(new Gun(this.getPlayer()));
                        System.out.println(this.getPlayer().getCharacterWeapon().getName() + " silahını seçtiniz.");
                    } else {

                        System.out.println("Yetersiz bakiye");
                        System.out.println("Bakiyeniz:" + this.getPlayer().getCoin());
                    }

                }
            }
            if (selectItem == 2) {
                System.out.println("\nZırhlar");
                Armor[] armorList = {new hafifArmor(), new ortaArmor(), new agirArmor()};
                for (int i = 0; i < armorList.length; i++) {
                    System.out.print((i + 1) + "-");
                    armorList[i].ToString();
                }
                System.out.print("Bir zırh seçiniz:");
                int selectArmor = scanner.nextInt();
                while (selectArmor < 1 || selectArmor > 3) {
                    System.out.print("Geçersiz değer. Tekrar giriniz:");
                    selectArmor = scanner.nextInt();
                }
                if (selectArmor == 1) {
                    if (this.getPlayer().getCoin() > new hafifArmor().getPrice()) {
                        this.getPlayer().setCoin(this.getPlayer().getCoin() - new hafifArmor().getPrice());
                        this.getPlayer().setCharacterArmor(new hafifArmor(this.getPlayer()));
                        System.out.println(this.getPlayer().getCharacterArmor().getName() + " zırhını seçtiniz.");
                    } else {
                        System.out.println("Yetersiz bakiye");
                        System.out.println("Bakiyeniz:" + this.getPlayer().getCoin());

                    }

                }
                if (selectArmor == 2) {
                    if (this.getPlayer().getCoin() > new ortaArmor().getPrice()) {
                        this.getPlayer().setCoin(getPlayer().getCoin() - new ortaArmor().getPrice());
                        this.getPlayer().setCharacterArmor(new ortaArmor(this.getPlayer()));
                        System.out.println(this.getPlayer().getCharacterArmor().getName() + " zırhını seçtiniz.");
                    } else {
                        System.out.println("Yetersiz bakiye");
                        System.out.println("Bakiyeniz:" + this.getPlayer().getCoin());

                    }

                }
                if (selectArmor == 3) {
                    if (this.getPlayer().getCoin() > new agirArmor().getPrice()) {
                        this.getPlayer().setCoin(getPlayer().getCoin() - new agirArmor().getPrice());
                        this.getPlayer().setCharacterArmor(new agirArmor(this.getPlayer()));
                        System.out.println(this.getPlayer().getCharacterArmor().getName() + " zırhını seçtiniz.");
                    } else {
                        System.out.println("Yetersiz bakiye");
                        System.out.println("Bakiyeniz:" + this.getPlayer().getCoin());

                    }

                }
            }
            if (selectItem == 3) {
                break;
            }
        }
        return true;
    }
}
