public class Main {
    public static void main(String[] args) {
        Intr i1 = new IntrImpl();
        i1.sayHello("Suresh");

        Intr i2 = new Intr() {

            @Override
            public void sayHello(String name) {
                System.out.println("Welcome : " + name + " --> using annonymous class");
            }
        };
        i2.sayHello("Priti");

        Intr i3 = name -> System.out.println("Welcome : " + name + " --> using LE");
        i3.sayHello("Saumya");
    }
}
