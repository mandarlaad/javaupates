
public class Java19_VirtualThreads {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Running in: " + Thread.currentThread());
        Thread.startVirtualThread(task);
    }
}
