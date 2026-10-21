import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn;
        String mNumber;
        String menuChoice;

        ssn = SafeInput.getRegExString(
                in,
                "Enter SSN (###-##-####)",
                "^\\d{3}-\\d{2}-\\d{4}$");

        mNumber = SafeInput.getRegExString(
                in,
                "Enter UC M Number",
                "^(M|m)\\d{5}$");

        menuChoice = SafeInput.getRegExString(
                in,
                "Enter menu choice (O,S,V,Q)",
                "^[OoSsVvQq]$");

        System.out.println("\nResults:");
        System.out.println("SSN: " + ssn);
        System.out.println("M Number: " + mNumber);
        System.out.println("Menu Choice: " + menuChoice);
    }
}
