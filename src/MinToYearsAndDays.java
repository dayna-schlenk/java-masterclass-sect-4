public class MinToYearsAndDays {
    public void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            // Minutes to hours
            long hours = minutes / 60;
            // Hours to days
            long days = hours / 24;
            // Days to years
            long years = days / 365;
            // Get remaining days, if any
            days %= 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
