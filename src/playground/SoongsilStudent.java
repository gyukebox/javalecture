package playground;

public class SoongsilStudent extends UniversityStudent implements Line7 {
    @Override
    public void gotoSchool() {
        System.out.println("평지 개이득");
    }

    @Override
    public void rideLine7() {
        System.out.println("숭실대입구역에서 내립니다");
    }
}
