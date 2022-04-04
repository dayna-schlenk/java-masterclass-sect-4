/* Challenge tips:
-> Use int or long for your number data types
-> 1 minute = 60 seconds
-> 1 hour = 60 minutes (or 3600 seconds)
*/

// INSTRUCTOR SOLUTION

public class SecAndMin2 {
    public String getDurationString(long minutes, long seconds) { // int is okay as well
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    // Method overloading
    // public String getDurationString(long seconds) { // int is okay as well
    //     // code
    // }
}
