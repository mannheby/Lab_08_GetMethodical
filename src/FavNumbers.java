import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;
        favInt = SafeInput.getInt(in, "Input your favorite integer");
        favDouble = SafeInput.getDouble(in, "Input your favorite double");
        System.out.println("\nYour favorite integer is: " + favInt + ", and your favorite double is: " + favDouble);

    }
}
