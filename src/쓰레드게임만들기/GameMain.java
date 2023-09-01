package 쓰레드게임만들기;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("강력한 체력과 물리공격력의 전사 이름을 정하세요 : ");
            String warriorName = sc.next();
            System.out.print("궁극의 마법 능력을 지닌 마법사 이름을 정하세요 : ");
            String wizardName = sc.next();
            Character warrior =
                    new Character(warriorName, 80, 20, 0.8, 0.5,400, 2500);
            Character wizard =
                    new Character(wizardName, 20, 280, 0.5, 0.9, 1000, 1250);
            GameThA gameThA = new GameThA(warrior, wizard);
            GameThB gameThB = new GameThB(warrior, wizard);
            gameThA.start();
            gameThB.start();
        }
    }

