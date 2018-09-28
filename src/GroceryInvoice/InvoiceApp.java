package GroceryInvoice;

import java.util.HashSet;
import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {

        HashSet<GroceryItems> myItems = new HashSet<>();


        Scanner input = new Scanner(System.in);
        String data = "";
        int itemsPuchased = 0;
        double totalPurchase = 0;
        do {
            System.out.println("Enter Item Name");
            GroceryItems items = new GroceryItems();
            String itemName = input.nextLine();
            items.setItemName(itemName);
            //loop

            System.out.println("Enter Item Price");
            double priceItem = input.nextDouble();
            items.setPrice(priceItem);

            System.out.println("Enter Item Quantity");
            int numberOfItem = input.nextInt();
            input.nextLine();

            items.setQuantity(numberOfItem);
            double cost = numberOfItem * priceItem;
            items.setCost(cost);
            totalPurchase = cost + totalPurchase;
            myItems.add(items);
            itemsPuchased++;

            System.out.println("Do you have another Item? Yes or No");

            data = input.nextLine();


        } while (data.equalsIgnoreCase("Yes"));

        System.out.println("Item Name\t\t\tPrice\t\tQuantity\t\tCost");
        for (GroceryItems obj : myItems) {

            System.out.println(obj.getItemName()+"\t\t\t\t"+obj.getPrice()
                   + "\t\t\t"+obj.getQuantity()+"\t\t\t"+obj.getCost());
        }

        System.out.println("Total Purchase Amount = " + totalPurchase);

        System.out.println("Total Items Purchased: " + itemsPuchased);

    }

}
