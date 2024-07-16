public class PassByReference {

    public static void changeName(Person p) {
        p.name = "Jane";
        System.out.println("Inside method: " + p.name);
    }
}
