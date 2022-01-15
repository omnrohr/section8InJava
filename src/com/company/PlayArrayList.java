package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayArrayList {
    private ArrayList<String> groceryItems = new ArrayList<>();

    private void addGroseryItems(String item){
        groceryItems.add(item);
        System.out.println("Item: (" + item + ") added successfully.");
    }
    private void printGroceryList(){
        System.out.println("The list have " +groceryItems.size()+ " items.");
        for (int i = 0 ; i<groceryItems.size(); i++){
            System.out.println("item "+(i+1)+" "+groceryItems.get(i));
        }
    }
    private void modifyGroceryItem(String newItem){
        int itemId= getItemIdByItem(newItem);
        if (itemId>=0) modifyGroceryItem(newItem, itemId);
        else System.out.println("Item not found.");
    }
    private void modifyGroceryItem(String newItem, int itemId){
        groceryItems.set(itemId, newItem);
        System.out.println("grocery Item number: "+(itemId+1)+" has been modified");
    }
    private void removeGroceryItem(int itemID){
        groceryItems.remove(itemID);
        System.out.println("Item number "+itemID+" has been removed successfully.");
    }
    private String getItem(String searchFor){
        int itemId = groceryItems.indexOf(searchFor);
        if (itemId>=0){
            return groceryItems.get(itemId);
        }return null;
    }
    private int getItemIdByItem(String item){
        return groceryItems.indexOf(item);
    }
    private void printOptions(){
        System.out.println(
                "\n The Options:\n" +
                        "\t 0 - To print options.\n"+
                        "\t 1 - To print the list of grocery items.\n"+
                        "\t 2 - To add an item to grocery list.\n"+
                        "\t 3 - To modify an item to grocery list.\n" +
                        "\t 4 - To remove an item from grocery list.\n"+
                        "\t 5 - To search for an item in grocery list.\n"+
                        "\t 6 - To quit the application.\n"
        );
    }
    public void startUp(){
        printOptions();
        Scanner scanner = new Scanner(System.in);
        boolean active = true;
        while (active){
            System.out.println("What to do: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice <0 || choice >6){
                System.out.println("invalid choice, please enter a valid choice.");
                continue;
                }
            switch (choice){
                case 0:
                    printOptions();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    System.out.println("Enter item name: ");
                    String item = scanner.nextLine();
                    addGroseryItems(item);
                    break;
                case 3:
                    System.out.println("Please enter the new item: ");
                    String newItem = scanner.nextLine();
                    System.out.println("Please enter the item ID: ");
                    int itemId = scanner.nextInt()-1;
                    scanner.nextLine();
                    modifyGroceryItem(newItem,itemId);
                    break;
                case 4:
                    System.out.println("Please enter the item ID: ");
                    int rItemId = scanner.nextInt()-1;
                    scanner.nextLine();
                    removeGroceryItem(rItemId);
                    break;
                case 5:
                    System.out.println("Please enter item name you like to search for.");
                    String searchFor = scanner.nextLine();
                    String result = getItem(searchFor);
                    System.out.println("Item is: "+result);
                    break;
                case 6:
                    System.out.println("Exiting..... good bye,");
                    active=false;

            }
        }

    }
}
