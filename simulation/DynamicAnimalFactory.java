package simulation;
import java.lang.reflect.Constructor;
public class DynamicAnimalFactory {

    public static Animal create(String category, String className,
                                TechnicalTraits<Integer> traits, PhysicalTraits traits2) {
        try {
            // Construct full class path
            String path = "species." + category.toLowerCase() + "." + capitalize(className);

            // Load the class dynamically
            Class<?> clazz = Class.forName(path);

            // Find the constructor
            Constructor<?> constructor = clazz.getConstructor(String.class, TechnicalTraits.class, PhysicalTraits.class);

            // Create object dynamically
            return (Animal) constructor.newInstance(className, traits, traits2);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Animal creation failed");
        }
    }

    private static String capitalize(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
