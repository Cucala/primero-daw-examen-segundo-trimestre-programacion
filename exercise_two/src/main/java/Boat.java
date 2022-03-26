public class Boat extends Vehicle {
    private int length;
    private boolean hasASail;

    public Boat(
            int numberOfPassengers,
            boolean haveCrew,
            int numberOfWheels,
            String registrationDate,
            String meansOfTravel,
            int length,
            boolean hasASail
    ) {
        super(numberOfPassengers, haveCrew, numberOfWheels, registrationDate, meansOfTravel);
        this.length = length;
        this.hasASail = hasASail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isHasASail() {
        return hasASail;
    }

    public void setHasASail(boolean hasASail) {
        this.hasASail = hasASail;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "\n  " + super.toString() +
                "\n  length=" + length +
                ",\n  hasASail=" + hasASail +
                "\n}";
    }
}
