import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


//Purpose: Performs an action on a given object without returning a result
//
//	Example Use Cases:
//        •	Printing or logging each item in a list.
//        •	Applying updates or side effects to objects (e.g., updating a database record).
//


public class ConsumerExample {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("chicken",200),
                new Item("egg",10),
                new Item("Flower",50)
        );

        Consumer<Item> printUpperCase = item ->
                System.out.println(item.getItemName().toUpperCase());

        items.forEach(printUpperCase);
    }
}

class Item {
    private String itemName ;

    private int price;

    public Item(String itemName, int price) {
        this.price = price;
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }
}