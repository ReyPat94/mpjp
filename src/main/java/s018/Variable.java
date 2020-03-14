package s018;

public class Variable {
    public static void main(String[] args) {
        int value = 42;
        String name = "Bob";

        System.out.println(name);
        System.out.println(value);

        // Dangerous! Beware of null! creo un
        // reference che non indica niente
        String noName = null;
        System.out.println(noName);
        
//        // Java 10 inferred type
//        var bValue = 42;
//        var bName = "Tom";
//
//        System.out.println(bName);
//        System.out.println(bValue);
    }
}
