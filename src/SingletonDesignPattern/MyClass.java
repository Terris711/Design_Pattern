package SingletonDesignPattern;

public class MyClass {
    // Eagerly creating singleton class
    private static MyClass uniqueInstance = new MyClass();
    String name;

    private MyClass() {
    }

    public static MyClass getInstance() {
//        if (uniqueInstance == null ) {
//            uniqueInstance = new MyClass();
//        }

        return uniqueInstance;
    }
}
