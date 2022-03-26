public class Motorcycle extends Vehicle {
    private int displacement;

    public Motorcycle(
        int numberOfPassengers,
        boolean haveCrew,
        int numberOfWheels,
        String registrationDate,
        String meansOfTravel,
        int displacement
    ) {
        super(
            numberOfPassengers,
            haveCrew,
            numberOfWheels,
            registrationDate,
            meansOfTravel
        );

        this.displacement = displacement;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "\n  " + super.toString() +
                "\n  displacement=" + displacement +
                "\n}";
    }
}
