import java.util.Scanner;
import java.util.InputMismatchException;

class ZeroDivisionException extends Exception {
    // így lehet saját Exception osztályt létrehozni
    // Egy ilyen típusú kivételt így tudunk kiváltani:
    //
    // throw new ZeroDivisionException();
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            try
            {
                System.out.print("1. szám: ");
                double szam1 = scanner.nextDouble();
                System.out.print("2. szám: ");
                double szam2 = scanner.nextDouble();
                double result = szam1 / szam2;
                if (Double.isInfinite(result)) {
                    throw new ZeroDivisionException();
                }
                System.out.printf("Az osztás eredménye: %.2f\n", result);

                System.out.println("-".repeat(10));
            }
            catch (InputMismatchException e)
            {
                System.out.println("Hibás szám!");
                scanner.next();
            }
            catch (ZeroDivisionException e)
            {
                // e.printStackTrace();
                System.out.println("Hiba: 0-val nem lehet osztani!");
            }
        }
    }
}
