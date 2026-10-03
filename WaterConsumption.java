import java.util.Scanner;
public class WaterConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 500;
        if (water <= 500) {
            System.out.println("Water Bill is Rs.100.");
        } else if (water > 500 ) {
            System.out.println("Water Bill is Rs.200.");
        }
    }
}

output :-
Enter water consumption: 500
Water Bill is Rs.100.
