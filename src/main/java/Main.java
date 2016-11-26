/**
 * Created by RicochetMKXI on 11/26/2016.
 */
public class Main {
    public static void main(String[] args){
        Person bob = new Person(8,9);
        Display.printInt(bob.getAge());
        bob.setAge(44);
        Display.printInt(bob.getAge());
        Display.printInt(bob.getHeight());
        bob.setHeight(8);
        Display.printInt(bob.getHeight());
        bob.incrementAge();
        bob.incrementAge();
        Display.printInt(bob.getAge());


    }
}
