import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class Main {
  public static void main(String[] args) throws InterruptedException {
    Scanner input = new Scanner(System.in);
    ArrayList<String> items = new ArrayList<String>();

    System.out.println("Commands:");
    System.out.println("add - Adds an item to the database.");
    System.out.println("remove - Removes an item from the database.");
    System.out.println("change - Changes an item in the database.");
    System.out.println("clear - Removes all items from the database.");
    System.out.println("list - Lists all items in the database.");
    System.out.println("quit - Stops the program.");

    while (true) {
        System.out.println("Enter a command:");
        String inputResult = input.nextLine();

        if (inputResult.equals("add")) { // add

            System.out.println("Enter some text to add:");
            String addInputResult = input.nextLine();
            items.add(addInputResult);
            System.out.println(addInputResult + " has been added to the database.");
            TimeUnit.SECONDS.sleep(1);

        } else if (inputResult.equals("remove")) { // remove

            System.out.println("Enter an item you would like to remove:");
            String removeInputResult = input.nextLine();
            items.remove(removeInputResult);
            System.out.println(removeInputResult + " has been removed from the database.");
            TimeUnit.SECONDS.sleep(1);

        } else if (inputResult.equals("change")) { // change

            System.out.println("Enter an item you would like to change:");
            String itemToChange = input.nextLine();
            System.out.println("Enter its new name:");
            String newItemName = input.nextLine();
            int oldItemIndex = items.indexOf(itemToChange);
            items.remove(itemToChange);
            items.add(oldItemIndex, newItemName);
            System.out.println(itemToChange + " has been changed to " + newItemName + ".");
            TimeUnit.SECONDS.sleep(1);

        } else if (inputResult.equals("clear")) { // clear

            items.clear();
            System.out.println("The database has been cleared.");
            TimeUnit.SECONDS.sleep(1);

        } else if (inputResult.equals("list")) { // list

            System.out.println("The items in the list are: " + items + ".");
            TimeUnit.SECONDS.sleep(1);

        } else if (inputResult.equals("quit")) { // quit
            
            System.out.println("Exiting the program...");
            TimeUnit.SECONDS.sleep(1);
            break;

        } else { // not a command

            System.out.println("That isn't a command.");
            TimeUnit.SECONDS.sleep(1);

        }
    }
    input.close();
  }
}