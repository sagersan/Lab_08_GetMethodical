import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name;
        int age;
        double gpa;
        int month;
        double testScore;
        boolean continueProgram;
        String zipCode;

        name = SafeInput.getNonZeroLenString(in,
                "Enter your name");

        age = SafeInput.getInt(in,
                "Enter your age");

        gpa = SafeInput.getDouble(in,
                "Enter your GPA");

        month = SafeInput.getRangedInt(in,
                "Enter birth month", 1, 12);

        testScore = SafeInput.getRangedDouble(in,
                "Enter test score", 0.0, 100.0);

        continueProgram = SafeInput.getYNConfirm(in,
                "Continue");

        zipCode = SafeInput.getRegExString(in,
                "Enter a 5-digit ZIP Code",
                "\\d{5}");

        System.out.println("\nResults:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Birth Month: " + month);
        System.out.println("Test Score: " + testScore);
        System.out.println("Continue: " + continueProgram);
        System.out.println("ZIP Code: " + zipCode);

    }
}
