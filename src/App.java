public class App {
    public static void main(String[] args) {
        Measurements measure = new Measurements();

        System.out.println(measure.calcFeetAndInchesToCentimeters(2, 8));

        System.out.println(measure.calcFeetAndInchesToCentimeters(38));
    }
}
