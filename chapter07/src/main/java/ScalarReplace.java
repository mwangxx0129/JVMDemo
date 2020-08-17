// -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGCDetails -XX:-EliminateAllocations
public class ScalarReplace {
    public static void main(String[] args) {
        System.out.println("Scalar replace");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; ++ i) {
            alloc();
        }
        long end  = System.currentTimeMillis();
        System.out.println("Cost time=" + (end - start) + "ms");
    }

    static class User {
        public int id;
        public String name;
    }

    public static void alloc() {
        User u = new User();
        u.id =5;
        u.name="XXXXXXXXXXXX";
    }
}
