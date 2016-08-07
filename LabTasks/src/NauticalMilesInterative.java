import javax.swing.*;

public class NauticalMilesInterative {
    public static void main(String[] args) {
        final double kilometersPerNauticalMile=1.852;
        final double milesPerNauticalMile=1.150779;
        String input=JOptionPane.showInputDialog(null, "Input the number of nautical miles");
        double numberOfNauticalMiles=Double.parseDouble(input);

        double noOfKilometers=numberOfNauticalMiles*kilometersPerNauticalMile;
        double noOfMiles=numberOfNauticalMiles*milesPerNauticalMile;
        System.out.println(""+String.format("%.4f", numberOfNauticalMiles)+" nautical miles is equal to "+String.format("%.4f", noOfMiles)+" kilometers or "+ String.format("%.4f", noOfKilometers)+" miles.");
    }
}
