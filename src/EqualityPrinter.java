public class EqualityPrinter {
    public void printEqual(int x, int y, int z) {
        String xNum = String.valueOf(x);
        String yNum = String.valueOf(y);
        String zNum = String.valueOf(z);

        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else {
            if ((xNum.compareTo(yNum) == 0) && (xNum.compareTo(zNum) == 0)) {
                System.out.println("All numbers are equal");          
            } else if ((xNum.compareTo(yNum) == 0) || (xNum.compareTo(zNum) == 0) || (zNum.compareTo(yNum) == 0)) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }
    }
}
