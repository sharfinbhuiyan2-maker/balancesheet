import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        System.out.println("Whats is ur name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("How old are u?");
        int age = scanner.nextInt();
        System.out.println(" ");
        int days = printDays(name, age);
        System.out.println( name + " is "+ days + " days old");
        scanner.close();
    }

    public static int printDays(String name, int age) {
        return age * 365;
    }
}