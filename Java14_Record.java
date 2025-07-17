
public class Java14_Record {
    record Person(String name, int age) {}

    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p.name());
    }
}
