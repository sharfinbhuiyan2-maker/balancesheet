import java.util.Scanner;

public class balancesheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daily Sales? ");
        double dailySales = scanner.nextDouble();
        System.out.println("Daily Expenses? ");
        double dailyExpenses = scanner.nextDouble();
        System.out.println("");
        double netRevenue = calcRevenue(dailySales, dailyExpenses);
        System.out.println("Your net revenue is: " + netRevenue);

        
    
    }
    public static double calcRevenue(double dailySales, double dailyExpenses) {
        return dailySales - dailyExpenses;
    }
    
}
