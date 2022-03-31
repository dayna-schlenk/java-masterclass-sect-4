/* Challenge tips:
-> Use int & long for your number data types
-> 1 minute = 60 seconds
-> 1 hour = 60 minutes (or 3600 seconds)
*/

public class SecAndMin {
    public String getDurationString(int minutes, int seconds) {
        // Validate
        if ((minutes >= 0) || ((seconds >= 0) && (seconds <= 59))) {
            // Calculate how many hours, minutes, & seconds equal the minutes & seconds passed to this method

            // Return that value as a String, formatted like so: XXh YYm ZZs (num hours, num minutes, & num seconds)
        } else {
            return "Invalid value";
        }
    }

    // Method overloading
    public String getDurationString(int seconds) {
        // Validate
        if (seconds >= 0) {
            // Calculate how many minutes are in the seconds value

            // Call the other overloaded method, passing the correct minutes & seconds calculated so that it can work properly
        } else {
            return "Invalid value";
        }
    }
}
