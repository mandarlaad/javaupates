
public class Java16_PatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello Java";
        if (obj instanceof String s) {
            System.out.println("Length: " + s.length());
        }
    }
}
