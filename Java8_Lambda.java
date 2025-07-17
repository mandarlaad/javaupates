
import java.util.Arrays;
import java.util.List;

public class Java8_Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob");
        names.forEach(name -> System.out.println(name));
    }
}
