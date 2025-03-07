
class Parent {

    String name;
    int age;

    Parent(String msg) {
        System.out.println("Parent Constructor: " + msg);
    }

    Parent() {
        System.out.println("Not parameterized constructor");
    }
}

class Child extends Parent {

    String name;

    Child() {
        super("Anurag");

        System.out.println("Child Constructor");
    }

    Child(String name) {
        this.name = name;
        super();
    }
}

public class main {

    public static void main(String[] args) {
        Child obj = new Child();
        Child obj1 = new Child("name");

    }
}
