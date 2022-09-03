package defaultmethod;

public class DefaultMethodApp {
    public static void main(String[] args) {
        var avanza = new Avanza();
        avanza.setTotalKilometer(3000);
        avanza.run();
        System.out.println("Is time to change the oil? " + (avanza.isTimeToChangeOil() ? "YES" : "nope"));
        System.out.println("Is already checkup? " + (avanza.isAlreadyCheckup() ? "YES" : "nope")); // tanpa perlu override
        System.out.println();
        System.out.println();

        var xsr155 = new XSR155();
        xsr155.setTotalKilometer(1500);
        System.out.println("Is time to change the oil? " + (xsr155.isTimeToChangeOil() ? "YES" : "nope"));
        xsr155.run();
        xsr155.doOffroad(); // perlu override
    }
}
