import javax.swing.*;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {

        final int QUARTSPERGALLON=4;
        String noOfQuartsNeededString= JOptionPane.showInputDialog(null, "Input the number of quarts reqired for the job", "Number of quarts", JOptionPane.INFORMATION_MESSAGE);
        int noOfQuartsNeeded=Integer.parseInt(noOfQuartsNeededString);
        int gallonsNeeded=noOfQuartsNeeded/QUARTSPERGALLON;
        int quartsNeeded=noOfQuartsNeeded%QUARTSPERGALLON;
        JOptionPane.showMessageDialog(null,"A job that requires "+noOfQuartsNeeded+" quarts requires "+gallonsNeeded+" gallons and "+quartsNeeded+" quarts.");

    }
}
