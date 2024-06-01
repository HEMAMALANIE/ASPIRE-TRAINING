public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println("Before accessing the array");
            int[] array = {25,11,2002};
            int value = array[4]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch: Array index out of bounds");
        } finally {
            System.out.println("Finally: This always runs");
        }
    }
}
