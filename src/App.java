public class App {
    public static void main(String[] args) {
        // SecAndMin myTry = new SecAndMin();
        // System.out.println(myTry.getDurationString(170, 45));

        // Testing...
        int minutes = 0;
        int seconds = 34;

        int totalSeconds = (minutes * 60) + seconds;
        System.out.println("Total seconds: " + totalSeconds);

        int newHours;
        int newMinutes;
        int remainingSeconds;

        if (totalSeconds >= 3600) {
            newHours = totalSeconds / 3600;
            System.out.println("New hours: " + newHours);
            remainingSeconds = totalSeconds % 3600;

            if (remainingSeconds >= 60) {
                newMinutes = remainingSeconds / 60;
                System.out.println("New minutes: " + newMinutes);
                remainingSeconds %= 60;   
            }

            System.out.println("Remaining seconds: " + remainingSeconds);

        } else if (totalSeconds < 3600 && totalSeconds >= 60) {
            newHours = 0;
            System.out.println("New hours: " + newHours);
            newMinutes = totalSeconds / 60;
            System.out.println("New minutes: " + newMinutes);
            remainingSeconds = totalSeconds % 60;
            System.out.println("Remaining seconds: " + remainingSeconds);
            
        } else if (totalSeconds < 60) {
            newHours = 0;
            newMinutes = 0;
            System.out.println("New hours: " + newHours);
            System.out.println("New minutes: " + newMinutes);
            System.out.println("Remaining seconds: " + totalSeconds);
        }
    }
}
