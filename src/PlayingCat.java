public class PlayingCat {
    public boolean isCatPlaying(boolean summer, int temperature) {
        // if (!summer && temperature >= 25 && temperature <= 35) {
        //     return true;
        // }

        // if (summer && temperature >= 25 && temperature <= 45) {
        //     return true;
        // }

        // return false;
        
        // REFACTOR
        // If summer is true, then the max temp is 45; otherwise, it is 35
        int max = summer ? 45 : 35;

        return temperature >= 25 && temperature <= max;
    }
}
