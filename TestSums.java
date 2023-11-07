public class TestSums {

    public static void main(String[] args) {
        testPrintSums();
    }

    public static void testPrintSums() {
        System.out.println("Running testPrintSums...");

        System.out.println("Expected output:");
        System.out.print("1\n3\n6\n10\n15\n21\n28\n36\n45\n55\n");

        System.out.println("Actual output:");
        Solution.print_sums();
    }
}