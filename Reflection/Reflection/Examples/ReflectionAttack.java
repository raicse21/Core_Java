package Examples;
import java.lang.reflect.Constructor;

// This is how to prevent a Singleton Class from the Reflection attack

// In the private constructor check if the instance is not null
// throw a new RuntimeException

class Singleton {
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance.");
        }
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class ReflectionAttack {
    public static void main(String[] args) {
        try {
            Singleton instance1 = Singleton.getInstance();

            // Reflection to create another instance
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton instance2 = constructor.newInstance(); // This will throw an exception

            System.out.println(instance1 == instance2); // Should not be possible
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
