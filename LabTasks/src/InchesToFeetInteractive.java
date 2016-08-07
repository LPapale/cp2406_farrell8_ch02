import javax.swing.*;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        final int INCHESPERFOOT=12;
        String inputString= JOptionPane.showInputDialog(null, "Enter the number of inches");
        int inches=Integer.parseInt(inputString);
        int noOfFeet=inches/INCHESPERFOOT;
        int noOfInches=inches%INCHESPERFOOT;

        JOptionPane.showMessageDialog(null,""+inches+" inches is equal to "+noOfFeet+" feet and "+noOfInches+" inches.");
    }
}
