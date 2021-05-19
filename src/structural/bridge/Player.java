package structural.bridge;

public abstract class Player {
    String name;
    Gun gun;

    public Player(String name, Gun gun) {
        this.name = name;
        this.gun = gun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public abstract  void shoot();
}
