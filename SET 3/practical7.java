public class practical7 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before calling method: " + num);
        PassByValue.changeValue(num);
        System.out.println("After calling method: " + num);
        Person person = new Person("John");
        System.out.println("Before calling method: " + person.name);
        PassByReference.changeName(person);
        System.out.println("After calling method: " + person.name);
        int result = ReturnValue.add(5, 3);
        System.out.println("Result of addition: " + result);
        Rectangle rect = ReturnObject.createRectangle(5, 10);
        System.out.println("Area of rectangle: " + rect.getArea());
    }
}
