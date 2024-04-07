
public class Dog {
    String name;
    String breed;
    int size;
    String color;
    int age;

    void eat() {

    }

    void run() {

    }

    void sleep() {

    }

    void sayHello() {
        System.out.println("sayHello i am " + this.name);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("tom");
        dog.sayHello();
    }

}
