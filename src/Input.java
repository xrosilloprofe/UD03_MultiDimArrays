import java.util.Scanner;

public class Input {
    public static int getInteger(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextInt()) {
            System.err.println("Please, enter an integer");
            sc.next();
        }
        return sc.nextInt();
    }

    public static double getDouble(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextDouble()) {
            System.err.println("Please, enter an integer");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.next();
    }

}
