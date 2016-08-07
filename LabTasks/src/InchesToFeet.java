public class InchesToFeet {

    public static void main(String[] args) {
        final int INCHESPERFOOT=12;
        int inches=500;
        int noOfFeet=inches/INCHESPERFOOT;
        int noOfInches=inches%INCHESPERFOOT;
        System.out.println(""+inches+" inches is equal to "+noOfFeet+" feet and "+noOfInches+" inches.");
    }
}
