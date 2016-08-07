public class NauticalMiles {
    public static void main(String[] args) {
       final double kilometersPerNauticalMile=1.852;
        final double milesPerNauticalMile=1.150779;
        double numberOfNauticalMiles=100;
        double noOfKilometers=numberOfNauticalMiles*kilometersPerNauticalMile;
        double noOfMiles=numberOfNauticalMiles*milesPerNauticalMile;
        System.out.println(""+numberOfNauticalMiles+" nautical miles is equal to "+String.format("%.4f", noOfKilometers)+" kilometers or "+ String.format("%.4f", noOfMiles)+" miles.");
    }
}
