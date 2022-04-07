public class App {
    public static void main(String[] args) {
        // MY SOLUTION
        SecAndMin myTry = new SecAndMin();
        System.out.println(myTry.getDurationString(65, 45));

        // INSTRUCTOR SOLUTION
        SecAndMin2 myTry2 = new SecAndMin2();
        System.out.println(myTry2.getDurationString(65, 45));

        // MY SOLUTION
        SecAndMin daynaTry2 = new SecAndMin();
        System.out.println(daynaTry2.getDurationString(3945));

        // INSTRUCTOR SOLUTION
        SecAndMin2 instructorTry2 = new SecAndMin2();
        System.out.println(instructorTry2.getDurationString(3945L));
    }
}
