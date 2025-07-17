
import java.util.ArrayList;
import java.util.List;

public class Java5_Generics {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        String name = names.get(0);
        System.out.println(name);
    }
}
