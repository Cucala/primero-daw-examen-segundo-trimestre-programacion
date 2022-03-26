public class Truck extends Vehicle {
    private int weight;
    private int height;

    public Truck(
        int numberOfPassengers,
        boolean haveCrew,
        int numberOfWheels,
        String registrationDate,
        String meansOfTravel,
        int weight,
        int height
    ) {
        super(
            numberOfPassengers,
            haveCrew,
            numberOfWheels,
            registrationDate,
            meansOfTravel
        );

        this.weight = weight;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "\n  " + super.toString() +
                "\n  weight=" + weight +
                ",\n  height=" + height +
                "\n}";
    }
}
