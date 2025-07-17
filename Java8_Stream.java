
import java.util.Arrays;
import java.util.List;

public class Java8_Stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "bb", "ccc");
        list.stream().filter(s -> s.length() > 1).forEach(System.out::println);
    }
}
