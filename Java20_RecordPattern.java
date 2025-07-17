
record Person(String name, int age) {}

public class Java20_RecordPattern {
    public static void main(String[] args) {
        Object obj = new Person("Alice", 30);
        if (obj instanceof Person(String name, int age)) {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}
