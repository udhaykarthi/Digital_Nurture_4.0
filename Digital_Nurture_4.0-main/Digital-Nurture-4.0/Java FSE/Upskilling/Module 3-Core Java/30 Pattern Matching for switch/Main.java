public class Main {
    public static void main(String[] args) {
        printType(42);
        printType("Hello");
        printType(3.14);
        printType(true);
        printType(null);
    }

    public static void printType(Object obj) {
        String result = switch (obj) {
            case Integer i -> "It's an Integer with value " + i;
            case String s -> "It's a String: \"" + s + "\"";
            case Double d -> "It's a Double with value " + d;
            case null -> "It's null";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println(result);
    }
}
