public class Robot {
    private final int number;
    private final int life;

    public Robot(int number) {
        this.number = number;
        this.life = (int) (Math.random() * 100);
    }

    public boolean haveMoreLifeThan(Robot robotToCompareLife) {
        return this.life > robotToCompareLife.life;
    }

    public boolean haveMoreOfFiftyPercentOfLife() {
        return this.life > 50;
    }

    @Override
    public String toString() {
        return "Robots {"
                    + "Numero=" + this.number
                    + ", Vida=" + this.life
                + "}";
    }
}
