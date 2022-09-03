package defaultmethod;

public interface Car extends Vehicle{
    default boolean isAlreadyCheckup() {
        return false;
    }
}
