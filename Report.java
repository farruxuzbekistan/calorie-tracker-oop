public class Report {

    private double walkingTime;
    private double runningTime;
    private double cyclingTime;
    private double totalCaloriesBurned;
    private double goal;

    public Report(double walkingTime, double cyclingTime, double totalCaloriesBurned, double runningTime, double goal) {
        this.walkingTime = walkingTime;
        this.cyclingTime = cyclingTime;
        this.totalCaloriesBurned = totalCaloriesBurned;
        this.runningTime = runningTime;
        this.goal = goal;
    }

    public void printActivitySummary() {
        System.out.println("\nFAOLIYAT XULOSASI");
        System.out.println("-------------------------------------------------");
        System.out.println("Yurish vaqti: " + walkingTime + " daqiqa");
        System.out.println("Yugurish vaqti: " + runningTime + " daqiqa");
        System.out.println("Velosipedda yurish vaqti: " + cyclingTime + " daqiqa");
        System.out.println("Umumiy ishlatilgan kaloriya: " + totalCaloriesBurned + " kaloriya");
    }

    public void checkGoalAchieved() {
        System.out.println("\n FITNESS MAQSAD");
        System.out.println("-------------------------------------------------");
        if (totalCaloriesBurned >= goal)
            System.out.println("TABRIKLAYMIZ, SIZ KUNLIK MAQSADINGIZGA ERISHDINGIZ!");
        else
            System.out.println("Siz " + (goal - totalCaloriesBurned) + " kaloriya kam ishlatdingiz.");
    }

    public void provideAdvice() {
        System.out.println("\n MASLAHAT");
        System.out.println("-------------------------------------------------");
        if (walkingTime < 30) {
            System.out.println("Kuniga kamida 30 daqiqa yurishingizni maslahat beramiz");
        }

        if (runningTime < 20) {
            System.out.println("Kuniga kamida 20 daqiqa yugurishingizni maslahat beramiz");
        }

        if (cyclingTime < 30) {
            System.out.println("Velosipedda kamida 30 daqiqa yurishingizni maslahat beramiz");
        }

        if (totalCaloriesBurned < 300) {
            System.out.println(
                    "Kuniga kamida 300 kaloriya ishlatishingiz uchun yurish, yugurish, va velosipedda yurishingizni oshiring");
        }
    }
}
