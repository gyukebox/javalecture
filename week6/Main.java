package week6;

public class Main {
    public static void main(String[] args) {
        Lion lionKing = new Lion(14);
        lionKing.cry();
        lionKing.eat(new Deer(1));
        lionKing.eat(new Animal("토끼", 2) {
            @Override
            public void cry() {

            }

            @Override
            public void move() {
                System.out.println("깡충깡충");
            }
        });
        lionKing.move();
    }
}
