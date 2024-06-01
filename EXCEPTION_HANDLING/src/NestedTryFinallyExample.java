public class NestedTryFinallyExample {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            try {
                int value = array[5];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds");
            } finally {
                System.out.println("Inner finally: Always runs");
            }
            int y = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Division by zero");
        } finally {
            System.out.println("Outer finally: Always runs");
        }
    }
}

