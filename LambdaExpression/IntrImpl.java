public class IntrImpl implements Intr {

    @Override
    public void sayHello(String name) {
        System.out.println("Welcome : " + name + " --> using External Class");
    }
    
}
