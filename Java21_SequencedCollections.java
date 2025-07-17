
import java.util.SequencedCollection;
import java.util.LinkedList;

public class Java21_SequencedCollections {
    public static void main(String[] args) {
        SequencedCollection<String> list = new LinkedList<>();
        list.addFirst("First");
        list.addLast("Last");
        list.forEach(System.out::println);
    }
}
