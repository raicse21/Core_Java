package Examples;

// This is the best method to create a Singleton Instance as Enum variables
// always have a single instance

enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("Singleton using Enum.");
    }
}

public class EnumTest {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;

        System.out.println(instance1 == instance2); // Always true
    }
}
