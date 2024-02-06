import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String LocationName;
    protected Scanner scanner=new Scanner(System.in);

    public Location(Player player, String LocationName) {
        this.player = player;
        this.LocationName=LocationName;

    }
    abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }
}
