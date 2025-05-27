import java.lang.reflect.*;
 class Reflection {
    public static void main(String[] args) {
        try {
            // Load the Person class dynamically
            Class<?> clazz = Class.forName("Person");

            // Create an object using the default constructor
            Object personInstance = clazz.getDeclaredConstructor().newInstance();

            // Get all declared methods
            Method[] methods = clazz.getDeclaredMethods();

            System.out.println("🔍 Methods in Person class:");
            for (Method method : methods) {
                System.out.print("Method: " + method.getName() + "(");

                // Print parameter types
                Class<?>[] paramTypes = method.getParameterTypes();
                for (int i = 0; i < paramTypes.length; i++) {
                    System.out.print(paramTypes[i].getSimpleName());
                    if (i < paramTypes.length - 1) System.out.print(", ");
                }

                System.out.println(")");
            }

            // Invoke setName method
            Method setNameMethod = clazz.getDeclaredMethod("setName", String.class);
            setNameMethod.invoke(personInstance, "Vijay");

            // Invoke greet method
            Method greetMethod = clazz.getDeclaredMethod("greet");
            greetMethod.invoke(personInstance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
