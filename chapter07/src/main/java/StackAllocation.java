/**
 * -Xmx256m -Xms256m -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; ++ i) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("Cost time=" + (end -start) + "ms");
        System.out.println("hello");
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void alloc() {
        User user= new User();
    }

    static class User {

    }
}