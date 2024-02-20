public class Recursion{
    public static void main(String[] args) {
        message(3); // Count to make sure it doesn't become an infinite loop
    }
    private static void message(int count) {
        System.out.println("Hello World");
        if (count <= 1) { // Stops the recursive call
            return;
        }
        message(count -1);
    }
}
