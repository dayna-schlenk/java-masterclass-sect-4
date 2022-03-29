public class App {
    public static void main(String[] args) {
        Score score = new Score();
        int myScore = score.calculateScore("dschlenk192", 23);
        System.out.println("New score is " + myScore);
    }
}
