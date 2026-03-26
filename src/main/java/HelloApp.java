public class HelloApp {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        }
        else {
            // Join all names with comma and space
            String result = String.join(", ", args);

            System.out.println("Hello " + result);
        }
    }
}