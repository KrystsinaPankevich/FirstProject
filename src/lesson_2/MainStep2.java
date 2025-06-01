package lesson_2;

public class MainStep2 {
    public static void main(String[] args) {
        System.out.println("Variables");

        String name = "Krystsina";
        String surname = "Pankevich";
        int age = 28;
        String profession = "Service Manager with German";
        boolean siblings = true;
        boolean single = false;

        System.out.println("My name is " + name);
        System.out.println("My surname is " + surname);
        System.out.println("I am " + age + " years old");
        System.out.println("I am a " + profession);
        System.out.println("Do I have any brothers or sisters? " + siblings);
        System.out.println("Am I single? " + single);

        int x = 5;
        int y = 10;

        System.out.println(x + y); // Arithmetic operations
        System.out.println(x * y);
        System.out.println(x % y);
        System.out.println((x % y) + (x - y));

        System.out.println();
        System.out.println(x == y); // Logical comparison operations
        System.out.println(x > y);
        System.out.println(x != y);
        System.out.println(y <= x);

        System.out.println();
        System.out.println(true && false); // Logical operations

        System.out.println();
        System.out.println("x++ " + (x++)); // Increment (++) and decrement (--)
        System.out.println("y-- " + (y--));
        System.out.println(x);
        System.out.println(y);

        System.out.println("\n");

        double x1 = 124.45;
        int y1 = (int) x1;

        System.out.println("int: " + y1); // Type casting of primitive data types





    }
}
