package playground;

public class KonkukStudent extends UniversityStudent implements Line2, Line7 {
    private int distanceToStation;
    private String bulidingName;

    public KonkukStudent(String bulidingName) {
        this.bulidingName = bulidingName;
    }

    @Override
    public void gotoSchool() {
        rideLine7();
        System.out.println(super.name + "이 일감호를 걷습니다");
    }

    @Override
    public void rideLine2() {
        System.out.println("건대입구역에서 내립니다");
    }

    @Override
    public void rideLine7() {
        if(bulidingName.equals("새천년관")) {
            System.out.println("어린이대공원역에서 내립니다");
        } else {
            System.out.println("건대입구역에서 내립니다");
        }
    }

    @Override
    public void gotoStation() {
        if (distanceToStation > 10) {
            System.out.println("버스를 타고 간다");
        } else {
            System.out.println("걸어간다");
        }
    }
}
