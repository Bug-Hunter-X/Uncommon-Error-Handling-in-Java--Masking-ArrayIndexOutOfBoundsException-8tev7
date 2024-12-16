public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred:");
            e.printStackTrace(); // Print stack trace for detailed debugging
            // Consider alternative handling or logging here based on the application requirements
        }
    }
} 