package week6;

public class Seagull extends Bird {
    public Seagull() {
        super("갈매기");
    }

    @Override
    public void cry() {
        System.out.println("끼룩끼룩끼룩");
    }
}
