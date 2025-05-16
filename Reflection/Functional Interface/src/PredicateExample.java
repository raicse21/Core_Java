

//•	Purpose: Tests a condition on an input and returns a boolean.
//        •	Example Use Cases:
//        •	Filtering collections (e.g., find all students with marks > 80).
//        •	Validating input data.


//Predicate<Item> expensive = item -> item.getPrice() > 500;
//items.stream().filter(expensive).forEach(System.out::println);


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample
{

    public static void main(String[] args) {

        List<Item> items = Arrays.asList(
                new Item("chicken", 650),
                new Item("pizza", 250),
                new Item("burger", 770),
                new Item("chips", 530)
        );

        Predicate<Item> isExpensive = item -> item.getPrice() > 500;

        items.stream()
                .filter(isExpensive)
                .forEach(item -> System.out.println(item.getItemName() + " is Expensive"));
    }
}
