import java.util.Scanner;

public class Race {
    public static void main(String[] args) {
       
        Racecar car = new Racecar();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
           
         String command = scanner.next();
            if (!scanner.hasNextDouble()) {
                System.out.println("Ungültig");
                 continue;
            }
        double value = scanner.nextDouble();

            if (command.equalsIgnoreCase("accel")) {

                car.accelerate(value);
         } else if (command.equalsIgnoreCase("decel"))
             {
                car.decelerate(value);
            } else if (command.equalsIgnoreCase("drive")) {
                car.drive(value);
            } 
            else {
                System.out.println("unknown command: " + command);
            }

            System.out.println(car);
        }

}
}

