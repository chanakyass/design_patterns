package creational.builder;

public class House {
    private String gps;
    private String firePlace;
    private String septicTank;
    private String garden;
    private String furnishings;

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getFirePlace() {
        return firePlace;
    }

    public void setFirePlace(String firePlace) {
        this.firePlace = firePlace;
    }

    public String getSepticTank() {
        return septicTank;
    }

    public void setSepticTank(String septicTank) {
        this.septicTank = septicTank;
    }

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public String getFurnishings() {
        return furnishings;
    }

    public void setFurnishings(String furnishings) {
        this.furnishings = furnishings;
    }

    @Override
    public String toString() {
        return "House{" +
                "gps='" + gps + '\'' +
                ", firePlace='" + firePlace + '\'' +
                ", septicTank='" + septicTank + '\'' +
                ", garden='" + garden + '\'' +
                ", furnishings='" + furnishings + '\'' +
                '}';
    }
}
