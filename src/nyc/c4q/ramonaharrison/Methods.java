package nyc.c4q.ramonaharrison;

/**
 * Created by mona on 3/12/15.
 */
public class Methods {
    public static void speak() {
        System.out.println("hello");
    }

    public static void shoutOut(String name) {
        System.out.println("Hey, " + name);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }



    public static void main(String[] args) {
        String n = "Von Neumann";
        shoutOut(n);
        System.out.println(add(2, 5));
    }
}
