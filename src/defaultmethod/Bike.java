package defaultmethod;

public interface Bike extends Vehicle {
    void doOffroad(); // perlu dilakukan override di class bawahnya karena bukan default method
}
