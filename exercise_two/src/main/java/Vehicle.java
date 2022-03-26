public class Vehicle {
    private int numberOfPassengers;
    private boolean haveCrew;
    private int numberOfWheels;
    private String registrationDate;
    private String meansOfTravel;

    public Vehicle(
        int numberOfPassengers,
        boolean haveCrew,
        int numberOfWheels,
        String registrationDate,
        String meansOfTravel
    ) {
        this.numberOfPassengers = numberOfPassengers;
        this.haveCrew = haveCrew;
        this.numberOfWheels = numberOfWheels;
        this.registrationDate = registrationDate;
        this.meansOfTravel = meansOfTravel;
    }

    public int getNumberOfPassengers() { return numberOfPassengers; }

    public boolean isCrew() {
        return haveCrew;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public String getMeansOfTravel() {
        return meansOfTravel;
    }

    public void setNumPasajeros(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setHaveCrew(boolean haveCrew) {
        this.haveCrew = haveCrew;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setMeansOfTravel(String meansOfTravel) {
        this.meansOfTravel = meansOfTravel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "\n    numberOfPassengers=" + numberOfPassengers +
                ",\n    haveCrew=" + haveCrew +
                ",\n    numberOfWheels=" + numberOfWheels +
                ",\n    registrationDate='" + registrationDate + '\'' +
                ",\n    meansOfTravel='" + meansOfTravel + '\'' +
                "\n  }";
    }
}
