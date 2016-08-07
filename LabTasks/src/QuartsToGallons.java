import javax.swing.*;

public class QuartsToGallons {

    public static void main(String[] args) {
        final int QUARTSPERGALLON=4;
        int noOfQuartsNeeded=18;
        int gallonsNeeded=noOfQuartsNeeded/QUARTSPERGALLON;
        int quartsNeeded=noOfQuartsNeeded%QUARTSPERGALLON;

        System.out.println("A job that requires "+noOfQuartsNeeded+" quarts requires "+gallonsNeeded+" gallons and "+quartsNeeded+" quarts.");
    }
}
