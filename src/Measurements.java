public class Measurements {
    // public int calcFeetAndInchesToCentimeters(int feet, int inches) {
    //     if ((feet >= 0) && (inches >= 0) && (inches <= 12)) {
    //         // calculate how many centimeters comprise feet (30.48 cent in 1 ft)
    //         double centInFt = Math.round(feet * 30.48);

    //         // calculate how many centimeters comprise inches (2.54 cent in 1 in)
    //         double centInInch = Math.round(inches * 2.54);

    //         // convert back to int
    //         int ftCentimeters = (int)centInFt;
    //         int inchCentimeters = (int)centInInch;
            
    //         // return total centimeters
    //         return ftCentimeters + inchCentimeters;
    //     }

    //     return -1;
    // }

    // // Method overloading
    // public int calcFeetAndInchesToCentimeters(int inches) {
    //     if (inches < 0) {
    //         return -1;
    //     }

    //     // calculate how many feet are in inches
    //     int feetInInches = Math.round(inches / 12);

    //     // call first method
    //     return calcFeetAndInchesToCentimeters(feetInInches, inches);
    // }

    public double calcFeetAndInchesToCentimeters(double feet, double inches) {
        // Validate
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid");
            return -1;
        } else {
            // With valid parameters...calculate centimeters for both feet and inches
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm.");
            return centimeters;
        }
    }

    // Method overloading
    public double calcFeetAndInchesToCentimeters(double inches) {
        // Validate
        if (inches < 0) {
            return -1;
        } else {
            // Convert inches to feet & get remainder of inches
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet, and " + remainingInches + " remaining inches.");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
