public class Calcaultor {
    private final static int CALORIES_PER_MIN_CYCLING = 8;
    private final static int CALORIES_PER_MIN_RUNNING = 10;
    private final static int CALORIES_PER_MIN_WALKING = 5;

    private double walkingTime;
    private double cyclingTime;
    private double runningTime;

    public Calcaultor(double walkingTime, double cyclingTime, double runningTime) {
        this.walkingTime = walkingTime;
        this.cyclingTime = cyclingTime;
        this.runningTime = runningTime;
    }

    public double calculateTotalCalories() {
        double walkingCalories = walkingTime * CALORIES_PER_MIN_WALKING;
        double runningCalories = runningTime * CALORIES_PER_MIN_RUNNING;
        double cyclingCalories = cyclingTime * CALORIES_PER_MIN_CYCLING;
        return walkingCalories + runningCalories + cyclingCalories;
    }
}
