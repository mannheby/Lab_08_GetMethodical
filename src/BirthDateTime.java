import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        year = SafeInput.getRangedInt(in, "What year were you born?", 1950, 2015);
        month = SafeInput.getRangedInt(in, "What month were you born?", 1, 12);
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "What day were you born?", 1, 31);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(in, "What day were you born?", 1, 30);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "What day were you born?", 1, 29);
                break;

        }
        hour = SafeInput.getRangedInt(in, "What hour were you born during?", 0, 23);
        minute = SafeInput.getRangedInt(in, "What minute were you born during?", 1, 59);
        System.out.println("You were born on " + month + "," + day + "," + year + " at hour " + hour + " and minute " + minute);


    }
}
