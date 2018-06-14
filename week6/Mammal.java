package week6;

public abstract class Mammal extends Animal {
    public Mammal(int age) {
        super("포유류", age);
    }

    public Mammal(String type, int age) {
        super(type, age);
    }

}
