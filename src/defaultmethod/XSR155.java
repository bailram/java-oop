package defaultmethod;

public class XSR155 implements Bike{
    private int totalKilometer;

    public void doOffroad() { // method yang harusnya bisa digantikan dengan default method
        System.out.println("No way if the track too muddy");
    }

    public void run() {
        System.out.println("running at maximum speed 135 km/h");
    }

    public boolean isTimeToChangeOil() {
        return false;
    }

    public int getTotalKilometer() {
        return totalKilometer;
    }

    public void setTotalKilometer(int totalKilometer) {
        this.totalKilometer = totalKilometer;
    }
}
