/**
 * Created by RicochetMKXI on 11/26/2016.
 */
public class Person {
    private int age;
    private int height;

    public Person (int initialAge, int initialHeight){
        this.age = initialAge;
        this.height = initialHeight;
    }

    public void setHeight(int changeHeight) {
        this.height = changeHeight;
    }

    public void setAge(int changeAge){
        this.age = changeAge;
    }

    public int getHeight(){
        return height;
    }

    public int getAge(){
        return age;
    }

    public int incrementAge(){
        return this.age += 1;
    }
}
