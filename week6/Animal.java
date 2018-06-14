package week6;

public abstract class Animal {
    private String type;
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public abstract void cry();
    public abstract void move();
}
