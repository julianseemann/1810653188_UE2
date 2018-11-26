import javax.swing.*;

public class Aufgabe3_1810653188
{
    public static void main (String []args)
    {
        String eingabe = JOptionPane.showInputDialog("Geben sie etwas ein");

        double alter = Double.parseDouble(eingabe);
        JOptionPane.showMessageDialog(null, alter);

        int alterint = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, alterint);

        boolean alterboolean = Boolean.parseBoolean(eingabe);
        JOptionPane.showMessageDialog(null, alterboolean);

        long alterlong = Long.parseLong(eingabe);
        JOptionPane.showMessageDialog(null, alterlong);

        char alterchar = eingabe.charAt(0);
        JOptionPane.showMessageDialog(null, alterchar);

        byte alterbyte = Byte.parseByte(eingabe);
        JOptionPane.showMessageDialog(null, alterbyte);

        short altershort = Short.parseShort(eingabe);
        JOptionPane.showMessageDialog(null, altershort);

        float alterfloat = Float.parseFloat(eingabe);
        JOptionPane.showMessageDialog(null, alterfloat);

        String alterneu = String.valueOf(alter);
        JOptionPane.showMessageDialog(null, alterneu);
    }
}
