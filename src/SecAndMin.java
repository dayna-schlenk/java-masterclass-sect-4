/* Challenge tips:
-> Use int or long for your number data types
-> 1 minute = 60 seconds
-> 1 hour = 60 minutes (or 3600 seconds)
*/

// MY SOLUTION

public class SecAndMin {
    public String getDurationString(int minutes, int seconds) {
        int totalSeconds;
        int newHours = 0;
        int newMinutes = 0;

        // Validate
        if ((minutes >= 0) || ((seconds >= 0) && (seconds <= 59))) {
            totalSeconds = (minutes * 60) + seconds;

            if (totalSeconds >= 3600) {
                newHours = totalSeconds / 3600;
                totalSeconds %= 3600;

                if (totalSeconds>= 60) {
                    newMinutes = totalSeconds / 60;
                    totalSeconds %= 60;
                }

            } else if (totalSeconds < 3600 && totalSeconds >= 60) {
                newHours = 0;
                newMinutes = totalSeconds / 60;
                totalSeconds %= 60;

            } else if (totalSeconds < 60) {
                newHours = 0;
                newMinutes = 0;
            }

            return newHours + "h " + newMinutes + "m " + totalSeconds + "s";

        } else {
            return "Invalid value";
        }
    }

    // Method overloading
    public String getDurationString(int seconds) {
        int minInSec = 0;
        int remainingSec = 0;

        // Validate
        if (seconds >= 0) {
            // Calculate how many minutes are in the seconds value
            minInSec = seconds / 60;
            remainingSec = seconds % 60;

            // Call the other overloaded method, passing the correct minutes & seconds calculated so that it can work properly
            return getDurationString(minInSec, remainingSec);

        } else {
            return "Invalid value";
        }
    }
}
