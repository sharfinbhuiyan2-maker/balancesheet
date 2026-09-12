import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Enter ur name bruh");
        String name = prompt.nextLine();
        System.out.println("how old u is?");
        int age = prompt.nextInt();
        System.out.println("whats up " + name);
        System.out.println("u are " + age + " years old");
        
    }
}