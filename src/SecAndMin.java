/* Challenge tips:
-> Use int or long for your number data types
-> 1 minute = 60 seconds
-> 1 hour = 60 minutes (or 3600 seconds)
*/

public class SecAndMin {
    // public String getDurationString(int minutes, int seconds) {
    //     int totalSeconds;
    //     int hours;
    //     int min;
    //     int sec;

    //     // Validate
    //     if ((minutes >= 0) || ((seconds >= 0) && (seconds <= 59))) {
    //         totalSeconds = (minutes * 60) + seconds;

    //         if (totalSeconds >= 3600) {
    //             min = totalSeconds / 60;
    //         }

    //         // Return as a String, formatted like so: XXh YYm ZZs (num hours, num minutes, & num seconds)
    //         return hours + "h " + min + "m " + sec + "s";
    //     } else {
    //         return "Invalid value";
    //     }
    // }

    // Method overloading
    // public String getDurationString(int seconds) {
    //     // Validate
    //     if (seconds >= 0) {
    //         // Calculate how many minutes are in the seconds value

    //         // Call the other overloaded method, passing the correct minutes & seconds calculated so that it can work properly
    //     } else {
    //         return "Invalid value";
    //     }
    // }
}
