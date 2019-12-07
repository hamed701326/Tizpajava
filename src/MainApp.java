import trip.*;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        /**
         * "0" is a brainy and traffic
         * "1" is a traffic
         * "2" is a brainy
         */
        String [] conditions=new String[]{"brainy and traffic","traffic","brainy"};
        int condition = random.nextInt(3);
        System.out.println("condition: "+conditions[condition]);
        Trip trip = null;
        System.out.print("Origin District: ");
        int originDistrict = scanner.nextInt();
        System.out.print("Destination District: ");
        int destinationDistrict = scanner.nextInt();
        Distance distance = new Distance(originDistrict, destinationDistrict);
        System.out.print("Which trip method would you like?" +
                "\n\t1.Economic Trip" +
                "\n\t2.Motor Trip" +
                "\n\t3.Special Trip" +
                "\n\t4.Exit" +
                "\n Choice:");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                trip = new EconomicTrip();
                break;
            case 2:
                trip = new MotorTrip();
                break;
            case 3:
                trip = new SpecialTrip();
                break;
            case 4:
                System.out.println("Thank you for your choice");
                break;
            default:
        }
        if (trip != null) user.order(trip, distance, condition);
    }
}
