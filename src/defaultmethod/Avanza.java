package defaultmethod;

public class Avanza implements Car {
    private int totalKilometer;

    public void run() {
        System.out.println("Running maximum speed at 200 km/h");
    }

    public void setTotalKilometer(int totalKilometer) {
        this.totalKilometer = totalKilometer;
    }

    public int getTotalKilometer() {
        return totalKilometer;
    }

    public boolean isTimeToChangeOil() {
        if (totalKilometer % 3000 == 0) {
            return true;
        }
        return false;
    }
}
