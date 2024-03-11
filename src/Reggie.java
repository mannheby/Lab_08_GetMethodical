import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCN = "";
        String Menu = "";
        SSN = SafeInput.getRegExString(in, "\nWhat is your Social Security number?", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("\nYour Social Security Number is " + SSN);
        UCN = SafeInput.getRegExString(in, "\nWhat is your UC Student M number?", "(M|m)\\d{5}");
        System.out.println("\nYour UC Student M number is " + UCN);
        Menu = SafeInput.getRegExString(in, "\nOpen[Oo] Save[Ss] View[Vv] Quit[Qq]", "[OoSsVvQq]");
        System.out.println("\nYou chose " + Menu);




    }
}
