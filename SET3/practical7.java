/*This Practical is made by 23CS042-SHASHAN LUMBHANI*/
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
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");

    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class PassByValue {
    public static void changeValue(int n) {
        n = 20;
        System.out.println("Inside method: " + n);
    }
}

class ReturnValue {
    public static int add(int a, int b) {
        return a + b;
    }
}


class ReturnObject {

    public static Rectangle createRectangle(int length, int width) {
        return new Rectangle(length, width);
    }
}
