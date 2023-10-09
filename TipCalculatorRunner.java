import java.util.Scanner;
import java.util.ArrayList;

public class TipCalculatorRunner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listOfItems = new ArrayList<String>(); // Two arraylists -- one for the items and other for prices.
        ArrayList<Double> listOfPrices = new ArrayList<Double>();

        String item;
        double price = 0;

        System.out.println("Welcome to the tip calculator. ");
        System.out.print("How many people? ");
        int peopleInGroup = scan.nextInt();
        scan.nextLine();
        System.out.print("Tip percentage? (0-100, whole numbers) ");
        double tipPercentage = scan.nextDouble();
        scan.nextLine();

        TipCalculator tipCalculator = new TipCalculator(peopleInGroup, tipPercentage);


        while (price != -1) { // Gets input for each menu item unless -1, otherwise breaks
            System.out.print("Enter a cost in dollars and cents, -1 to end: ");
            price = scan.nextDouble();

            if (price == -1) {
                break;
            }
            tipCalculator.addMeal(price);
            scan.nextLine();
            listOfPrices.add(price);
            System.out.print("Enter the item: ");
            item = scan.nextLine();
            listOfItems.add(item);
        }

        
        // Prints all variables out
        System.out.println("------------------------------\nTotal bill before tip: $" + tipCalculator.getTotalBillBeforeTip());
        System.out.println("Tip percentage: " + tipCalculator.getTipPercentage());
        System.out.println("Total tip: $" + tipCalculator.tipAmount());
        System.out.println("Total bill with tip: $" + tipCalculator.totalBill());
        System.out.println("Per person cost before tip: $" + tipCalculator.perPersonCostBeforeTip());
        System.out.println("Tip per person: $" + tipCalculator.perPersonTipAmount());
        System.out.println("Total cost per person: $" + tipCalculator.perPersonTotalCost() + "\n------------------------------");
        System.out.println("Items ordered: ");


        // Prints each item and corresponds the same index to the list of items.
        for(int i = 0; i < listOfItems.size(); i++) {
            System.out.println(listOfItems.get(i) + ", costed $" + listOfPrices.get(i));
        }

        scan.close();

    }


}