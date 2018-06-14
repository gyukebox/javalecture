package missilegame;

import missilegame.enemy.Enemy;
import missilegame.missile.Missile;
import missilegame.missile.NormalMissile;
import missilegame.missile.SpecialMissile;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Airplane plane;
    private static final Scanner scan = new Scanner(System.in);
    private static ArrayList<Enemy> enemies = new ArrayList<Enemy>();

    /**
     * 게임 준비 메소드. 적 2마리 만듦
     */
    private static void prepareGame() {
        String[] enemiesName = {"사람", "공룡"};
        int[] enemiesHealth = {100, 500};

        for (int i = 0; i < 2; i++) {
            enemies.add(new Enemy(enemiesName[i], enemiesHealth[i]));
        }
    }

    /**
     * 게임 플레이 하는 메소드
     * 기본적으로 종료 누를때까지 무한반복...
     */
    private static void playGame() {
        int playerAction = 0;

        while (playerAction != 3) {
            showMenu();
            playerAction = scan.nextInt();
            if (playerAction == 1) {
                Missile selectedMissile = selectMissile();
                if (plane == null) {
                    plane = initializePlane(selectedMissile);
                } else {
                    plane.setCurrentMissile(selectedMissile);
                }
            } else if (playerAction == 2) {
                if (plane == null || plane.getCurrentMissile() == null) {
                    System.out.println("공격하기 전에 미사일을 선택해야 합니다");
                    continue;
                }
                Enemy target = selectTarget();
                plane.attack(target);
            }
        }
    }

    /**
     * 메뉴 출력하는 함수
     */
    private static void showMenu() {
        System.out.println("1 : 미사일 선택하기");
        System.out.println("2 : 공격하기");
        System.out.println("3 : 종료하기");
    }

    /**
     * 미사일 선택
     * @return 미사일 객체
     */
    private static Missile selectMissile() {
        Missile missile = null;

        System.out.println("미사일을 선택하세요. 1: 일반 미사일, 2: 특수 미사일");
        int missileType = scan.nextInt();
        if (missileType == 1) {
            missile = new NormalMissile();
        } else if (missileType == 2) {
            missile = new SpecialMissile();
        } else {
            System.out.println("미사일 종류는 1(일반 미사일) 이나 2(특수 미사일) 이어야 합니다");
        }
        return missile;
    }

    /**
     * 비행기에 미사일을 박아준다
     * @param missile 고른 미사일
     * @return 미사일 장착된 비행기
     */
    private static Airplane initializePlane(Missile missile) {
        return new Airplane(missile);
    }

    /**
     * 공격할 적 선택
     * @return 공격당하는 적
     */
    private static Enemy selectTarget() {
        for (int i = 0; i < enemies.size(); i++) {
            System.out.println((i + 1) + ": " + enemies.get(i));
        }
        System.out.println("공격할 적을 선택하세요");
        return enemies.get(scan.nextInt() - 1);
    }

    public static void main(String[] args) {
        prepareGame();
        playGame();
    }
}
