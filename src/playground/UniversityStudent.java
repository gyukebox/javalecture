package playground;

public abstract class UniversityStudent {
    public String name;
    protected String major; //전공
    protected int grade; //학년
    protected double gpa; //학점

    public void wakeUp() {
        System.out.println("아 학교가기싫다.....");
    }

    public abstract void gotoSchool();
}