import javax.swing.*;

public class Aufgabe2_1810653188
{
    public static void main (String []args)
    {
        int variable1 = Integer.parseInt(JOptionPane.showInputDialog("Erste Zahl eingeben"));
        int variable2 = Integer.parseInt(JOptionPane.showInputDialog("Zweite Zahl eingeben"));

        if (variable1 == variable2)
        {
            System.out.println("Wert der beiden Variablen:" + variable1);
        }
        else
        {
            for (int i=1; ;i++)
            {
                if (variable1 > variable2)
                {
                    variable2++;
                }
                else
                {
                    variable1++;
                }
                if (variable1 == variable2)
                {
                    System.out.println("Wert der beiden Variablen:" + variable1 + " Nötige Schritte:" + i);
                    break;
                }

            }
        }
    }
}
