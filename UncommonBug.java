public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            //Let's throw a RuntimeException with a custom message
            throw new RuntimeException("Something went wrong", e);
        }
    }
}