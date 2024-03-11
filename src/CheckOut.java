import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double  itemPrice = 0;
       double totalPrice = 0;
       boolean done = false;
       do
       {
           itemPrice = SafeInput.getRangedDouble(in, "What is the price of your item?", .50, 10);
           totalPrice = totalPrice + itemPrice;
           done = SafeInput.getYNConfirm(in, "Are you finished checking out?");
       }while (!done);
        System.out.println("Your total cost is " + totalPrice);



    }
}
