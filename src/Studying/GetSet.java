package Studying;

public class GetSet {
    public static void main(String[] args) {
        home ev = new home();
        System.out.println(ev.diningRoom);
        ev.diningRoom = "kerboran";
        System.out.println(ev.diningRoom);
    }
}

class home {
    String livingRoom, diningRoom;
    void setLivingRoom(String livingRoom){this.livingRoom= livingRoom;    }
    String getLivingRoom(){return this.livingRoom;
    }
    void setDiningRoom(String diningRoom){this.diningRoom=diningRoom;}
    String getDiningRoom(){return this.diningRoom;}
}