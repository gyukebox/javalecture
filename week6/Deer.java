package week6;

public class Deer extends Mammal implements Herbivorous {
    public Deer(int age) {
        super("사슴", age);
    }

    @Override
    public void cry() {

    }

    @Override
    public void move() {
        System.out.println("호다닥");
    }

    @Override
    public void eat(String grass) {
        System.out.println(this.getType() + " 이 " + grass + " 을 먹습니다.");
    }
}
