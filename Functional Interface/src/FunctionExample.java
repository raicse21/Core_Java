import java.util.function.Function;

//•	Purpose: Transforms an input of type T to an output of type R.
//        •	Example Use Cases:
//        •	Mapping DTOs to entities in APIs.
//        •	Data transformation (e.g., converting strings to uppercase, extracting fields).
//        •	Composing multiple data processing steps.


//Function<UserDTO, User> userMapper = dto -> new User(dto.name, dto.age);


public class FunctionExample {
    public static void main(String[] args) {

        Function<String,Integer> strLength = (str) -> str.length();

        String name = "Rishikesh Rai";
        System.out.println(strLength.apply(name));
    }
}
