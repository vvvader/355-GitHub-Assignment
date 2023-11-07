public class TestSolution {

    public static void main(String[] args) {
        testMain();
    }

    public static void testMain() {
        System.out.println("Running testMain...");

        System.out.println("Expected output:");
        System.out.print("1\n3\n6\n10\n15\n21\n28\n36\n45\n55\n");

        System.out.println("Actual output:");
        Solution.main(null);
    }
}