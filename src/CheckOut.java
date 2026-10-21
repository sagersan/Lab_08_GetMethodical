import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice;
        double total = 0.0;
        boolean moreItems;

        do
        {
            itemPrice = SafeInput.getRangedDouble(
                    in,
                    "Enter item price",
                    0.50,
                    10.00);

            total += itemPrice;

            moreItems = SafeInput.getYNConfirm(
                    in,
                    "Do you have another item");

        } while(moreItems);

        System.out.printf("\nTotal Cost: $%.2f\n", total);
    }
}
