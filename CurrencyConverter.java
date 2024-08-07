import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double usdToEur = 0.85;
        double eurToUsd = 1.18;
        double usdToInr = 74.5;
        double inrToUsd = 0.013;
        
        System.out.println("This is the Currency Converter program");
        System.out.println("we have only three types of currency which can be searched");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.println("3. USD to INR");
        System.out.println("4. INR to USD");
        System.out.print("Choose an option which you want to convert (1-4): ");
        int option = sc.nextInt();
        
        System.out.print("Enter the amount you want to convert : ");
        double amount = sc.nextDouble();
        double convertAmount = 0;
        
        switch (option) {
            case 1:
                convertAmount = amount * usdToEur;
                System.out.println(amount + " USD in EUR is  " + convertAmount + " EUR");
                break;
            case 2:
                convertAmount = amount * eurToUsd;
                System.out.println(amount + " EUR in USD is  " + convertAmount + " USD");
                break;
            case 3:
                convertAmount = amount * usdToInr;
                System.out.println(amount + " USD in INR is  " + convertAmount + " INR");
                break;
            case 4:
                convertAmount = amount * inrToUsd;
                System.out.println(amount + " INR in USD is  " + convertAmount + " USD");
                break;
            default:
                System.out.println("sorry ! you have entered a wrong option ");
                System.out.println("please enter a valid option ");
                break;
        }
        
    }
}
