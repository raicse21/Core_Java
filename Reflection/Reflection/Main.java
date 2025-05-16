import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // Accessing a class in reflection ---------------------------
        //Class bird = Class.forName("Bird");

        Class bird = Bird.class;

//        Bird b = new Bird();
//        Class bird = b.getClass();

        System.out.println(bird.getName());
         //Accesing the methods in Reflection ---------------------
//        Method[] methods = bird.getDeclaredMethods();
//        for(Method m : methods){
//            System.out.println(m.getName());
//            System.out.println(m.getReturnType());
//            System.out.println(m.getDeclaringClass());
//        }

        //Accessing fields in Reflection ---------------------------
//        Field[] fields = bird.getDeclaredFields();
//        for(Field f : fields){
//            System.out.println(f.getName());
//            System.out.println(f.getType());
//            System.out.println(Modifier.toString(f.getModifiers()));
//        }
       // Bird eagle = new Bird();

        System.out.println("-------------------------------------------");
        // Setting public field value ---------------------------
//        Field field = bird.getField("breed");
//        field.set(eagle,"Indian");
//        System.out.println(eagle.breed);

        System.out.println("-------------------------------------------");
        // Setting private field value --------------------------
//        Field field2 = bird.getDeclaredField("speed");
//        field2.setAccessible(true);
//        System.out.println(field2.get(eagle));
//        field2.set(eagle,"fast");
//        System.out.println(field2.get(eagle));

        System.out.println("-------------------------------------------");
        //Accessing constructor in Reflection ------------------------
        Constructor[] constructors = bird.getDeclaredConstructors();
        for(Constructor c : constructors){
            System.out.println(c.getName());
            System.out.println(c.getDeclaringClass());

            //Accessing private constructor in Reflection ----------------------------
            c.setAccessible(true);

            Bird obj = (Bird)c.newInstance();

            obj.fly();
        }


        // This can break Singleton pattern as we can access private Constructor
        // and can create a new instance using it

        // It also breaks OOPs concept as we can access private members and modify them




    }
}