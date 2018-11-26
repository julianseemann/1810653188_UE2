public class Aufgabe4_1810653188
{
    public static void main (String []args)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Der Schleifenzähler ist: " + i);
        }



        int u = 1;
        while (u <= 10)
        {
            System.out.println("Der Schleifenzähler ist: " + u++);
        }



        int m = 1;
        do
        {
            System.out.println("Der Schleifenzähler ist: " +m);
            m++;
        }
        while (m <= 10);

    }
}
