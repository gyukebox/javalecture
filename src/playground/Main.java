package playground;

public class Main {
    public static void main(String[] args) {
        UniversityStudent student = new KonkukStudent("산학");
        student.name = "하은";
        student.gotoSchool();

        Line2 line2 = new KonkukStudent("공대");
    }
}
