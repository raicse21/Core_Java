import java.sql.SQLOutput;
import java.util.function.Supplier;

//•	Purpose: Supplies (generates) a result without taking any input.
//        •	Example Use Cases:
//        •	Lazy initialization of objects or resources.
//        •	Generating random values or timestamps.




public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Item> dummySupplier = () -> new Item("Dummy",0);

        Item item = dummySupplier.get();
        System.out.println("Supplied item: " + item.getItemName() +" Item Price: "+ item.getPrice());
    }

    static class Item {
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
}




