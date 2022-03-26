public class Bicycle extends Vehicle {
    private int spokeOfTheWheels;
    private boolean ofMountain;

    public Bicycle(
            int numberOfPassengers,
            boolean haveCrew,
            int numberOfWheels,
            String registrationDate,
            String meansOfTravel,
            int spokeOfTheWheels,
            boolean ofMountain
    ) {
        super(
                numberOfPassengers,
                haveCrew,
                numberOfWheels,
                registrationDate,
                meansOfTravel
        );

        this.spokeOfTheWheels = spokeOfTheWheels;
        this.ofMountain = ofMountain;
    }

    public int getSpokeOfTheWheels() {
        return spokeOfTheWheels;
    }

    public void setSpokeOfTheWheels(int spokeOfTheWheels) {
        this.spokeOfTheWheels = spokeOfTheWheels;
    }

    public boolean isOfMountain() {
        return ofMountain;
    }

    public void setOfMountain(boolean ofMountain) {
        this.ofMountain = ofMountain;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "\n  " + super.toString() +
                "\n  spokeOfTheWheels=" + spokeOfTheWheels +
                ",\n  ofMountain=" + ofMountain +
                "\n}";
    }
}
