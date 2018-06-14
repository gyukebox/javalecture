package week6;

public class Lion extends Mammal implements Carnivorous {
    public Lion(int age) {
        super(age);
    }

    @Override
    public void cry() {
        System.out.println("어흥");
    }

    @Override
    public void move() {
        System.out.println("성큼성큼");
    }

    @Override
    public void eat(Animal prey) {
        System.out.println("사자가 " + prey.getType() + " 을 먹습니다");
    }
}
