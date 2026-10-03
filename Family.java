import java.util.Scanner;
public class Family {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int members;
        System.out.print("Enter the number of family members: " );
        members = scanner.nextInt();


        double water;
        System.out.print("Enter the amount of water consumed (in liters): ");
        water = scanner.nextDouble();


        int number;
        System.out.print("Enter the house number: ");
        number = scanner.nextInt();

        char status;
        System.out.print("Enter the Water usage status (Y/N): ");
        status = scanner.next().charAt(0);
        scanner.close();

    }
}