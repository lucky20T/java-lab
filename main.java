public class main {
    public static void main(String[] args ){
        System.out.print("Hello, World!");
        System.out.print("This is a simple Java program.");
        printinline(args);
        printinlinedway(args);

    }
    public static void printinline(String[] args){
        System.out.println("This is an inline print statement.");
        System.out.println("It prints text without a newline at the end.");
        System.out.println("You can use this to print multiple lines in a single line.");
        System.out.println("This is useful for formatting output in a specific way.");
        System.out.println("You can also use it to print variables or expressions inline.");
        System.out.println("For example, the sum of 2 and 3 is: " + (2 + 3));
        // System.out.println("You can also use it to print the result of a method call: " + getGreeting());
    }
    public static void printinlinedway(String[] args){
        System.out.print("This is another inline print statement.\n");
        System.out.print("It also prints text without a newline at the end.\n");
        System.out.print("You can use this to print multiple lines in a single line.\n");
        System.out.print("This is useful for formatting output in a specific way.\n");
        System.out.print("You can also use it to print variables or expressions inline.\n");
        System.out.print("For example, the sum of 4 and 5 is: " + (4 + 5));
    }
}