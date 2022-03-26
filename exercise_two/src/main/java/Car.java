public class Car extends Vehicle {
    private int numberDoors;

    public Car(
        int numberOfPassengers,
        boolean haveCrew,
        int numberOfWheels,
        String registrationDate,
        String meansOfTravel,
        int numberDoors
    ) {
        super(
            numberOfPassengers,
            haveCrew,
            numberOfWheels,
            registrationDate,
            meansOfTravel
        );

        this.numberDoors = numberDoors;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\n  " + super.toString() +
                "\n  numberDoors=" + numberDoors +
                "\n}";
    }
}
