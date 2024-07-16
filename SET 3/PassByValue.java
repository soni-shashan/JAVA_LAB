public class PassByValue {
    public static void changeValue(int n) {
        n = 20;
        System.out.println("Inside method: " + n);
    }
}
