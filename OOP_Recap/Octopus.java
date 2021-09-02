import java.util.Random;

public class Octopus extends Animal {
    private static final Random random = new Random();
    private static final int min = 1;
    private static final int max = 10;

    public void makeDoActivity(){}

    public String selectActivity() {
        String activity;

        int activityNumber = random.nextInt(max) + min;

        switch (activityNumber) {

            case 1: activity = "something";
                 break;

            case 2: activity = "Eat";
                break;

            case 4,5: activity = "Jet Ink";
                break;

            default: activity = move();
        }

        return activity;
        
    }

    public String move() {
        return "swish";
    }
}
