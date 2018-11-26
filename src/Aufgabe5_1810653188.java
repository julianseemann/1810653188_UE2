import javax.swing.*;


public class Aufgabe5_1810653188
{
    public static void main (String []args)
    {
        forSchleife(5);
        forSchleife(15);
        whileSchleife(17);
        whileSchleife(26);
        nutzerschleife();
    }


        static void forSchleife(int a)
        {
            for (int i = 1; i <= a; i++)
            {
                System.out.println("Schleifenzähler = " + i);
            }

        }



        static void whileSchleife(int a)
        {
            int i = 0;
            while (i <= a)
            {
                System.out.println(i);
                i+= 2;
            }

        }



        static void nutzerschleife()
        {
            int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl ein"));
            int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl ein"));
            int x = 0;

            for (int i = 0; i < zahl1; i++)
            {
                for (int n = 0; n < zahl2; n++)
                {
                    x++;
                    System.out.println("Das ist der " + x + ". Durchlauf der inneren Schleife!");
                }
            }
        }
}
