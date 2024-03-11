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
        UCN = SafeInput.getRegExString(in, "\nWhat is your UC Student M number?", "(M|m)\\d{5}");


    }
}
