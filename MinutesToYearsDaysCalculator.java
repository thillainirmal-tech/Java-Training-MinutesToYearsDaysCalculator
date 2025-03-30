public class MinutesToYearsDaysCalculator {
 
    private static final int MIN_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int DAYS_PER_YEAR = 365;
    private static final int MIN_PER_DAY = HOURS_PER_DAY * MIN_PER_HOUR;
    private static final int MIN_PER_YEAR = MIN_PER_DAY * DAYS_PER_YEAR;

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / MIN_PER_YEAR;              // Calculate years
        long days = (minutes % MIN_PER_YEAR) / MIN_PER_DAY;  // Calculate remaining days
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Test cases:");
        printYearsAndDays(525600);    // Output: 1 y and 0 d
        printYearsAndDays(1051200);   // Output: 2 y and 0 d
        printYearsAndDays(561600);    // Output: 1 y and 25 d
        printYearsAndDays(1440);      // Output: 0 y and 1 d
        printYearsAndDays(-1);        // Output: Invalid Value
    }
}
