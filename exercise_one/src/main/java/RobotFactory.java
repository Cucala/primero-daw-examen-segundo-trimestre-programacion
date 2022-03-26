import java.util.ArrayList;

public class RobotFactory {
    private final ArrayList<Robot> robots = new ArrayList<>();

    public static void main(String[] args) {
        RobotFactory robotFactory = new RobotFactory();
        robotFactory.createRobots();
        robotFactory.printRobotsList();
        System.out.println();
        robotFactory.printRobotsOrderedFromLargestToSmallest();
        System.out.println();
        robotFactory.printNumberOfRobotsWithMoreOf50PercentOfLife();
        System.out.println();
        robotFactory.printTheThreeRobotsWithMoreLife();
    }

    public void createRobots() {
        int numberOfRobotsToCreate = (int) (Math.random() * 5) + 5;

        for (int i = 0; i < numberOfRobotsToCreate; i++)
            robots.add(new Robot(i));
    }

    public void printRobotsOrderedFromLargestToSmallest() {
        orderRobots();
        printRobotsList();
    }

    public void orderRobots() {
        Robot robotAuxiliarWithMoreLife;

        for(int i = 0 ; i < robots.size(); i++)
            for(int j = i+1 ; j < robots.size() ; j++)
                if (robots.get(i).haveMoreLifeThan(robots.get(j))) {
                    robotAuxiliarWithMoreLife = robots.get(i);
                    robots.set(i, robots.get(j));
                    robots.set(j, robotAuxiliarWithMoreLife);
                }
    }

    public void printNumberOfRobotsWithMoreOf50PercentOfLife() {
        int numberOfRobotsWithMoreOf50PercentOfLife = 0;

        for (Robot robot: robots)
            numberOfRobotsWithMoreOf50PercentOfLife += robot.haveMoreOfFiftyPercentOfLife() ? 1 : 0;

        System.out.println("Hay " + numberOfRobotsWithMoreOf50PercentOfLife + " con más del 50% de vida");
    }

    public void printRobotsList() {
        System.out.println("Lista de Robots:\n"+robots);
    }

    public void printTheThreeRobotsWithMoreLife() {
        System.out.println(robots.subList(robots.size()-3, robots.size()));
    }

    @Override
    public String toString() {
        return "App{" +
                "robots=" + robots +
                '}';
    }
}
