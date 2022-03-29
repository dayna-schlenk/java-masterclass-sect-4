public class Measurements {
    public int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
            // calculate how many centimeters comprise feet (30.48 cent in 1 ft)
            double centInFt = Math.round(feet * 30.48);

            // calculate how many centimeters comprise inches (2.54 cent in 1 in)
            double centInInch = Math.round(inches * 2.54);

            // convert back to int
            int ftCentimeters = (int)centInFt;
            int inchCentimeters = (int)centInInch;
            
            // return total centimeters
            return ftCentimeters + inchCentimeters;
        }

        return -1;
    }

    // Method overloading
    public int calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            // calculate how many feet are in inches
            int feetInInches = Math.round(inches / 12);

            // call first method
            calcFeetAndInchesToCentimeters(feetInInches, inches);
        }

        return -1;
    }
}