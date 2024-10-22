
public class Main {

    public static void main(String[] args) {
        double goal = Console.readNumber("Kunlik kaloriya maqsadingizni kiritjng (500-5000):", 500, 5000);
        double walkingTime = Console.readNumber("Kunlik yurish vaqtini (daqiqalarda) kiritng:", 0, 300);
        double runningTime = Console.readNumber("Kunlik yugurish vaqtini (daqiqalarda) kiritng:", 0, 300);
        double cyclingTime = Console.readNumber("Velosipedda yurish vaqtini (daqiqalarda) kiritng:", 0, 300);

        var calcaultor = new Calcaultor(walkingTime, runningTime, cyclingTime);
        double totalCaloriesBurned = calcaultor.calculateTotalCalories();

        var report = new Report(walkingTime, runningTime, cyclingTime, totalCaloriesBurned, goal);

        report.printActivitySummary();
        report.checkGoalAchieved();
        report.provideAdvice();

    }

}