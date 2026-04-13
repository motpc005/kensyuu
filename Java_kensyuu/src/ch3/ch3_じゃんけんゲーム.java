package ch3;
/*I still have AI correct the code but im becoming more comfortable with doing this myself.
 * Things to work on: organization, brackets, importing at top of code
 * if (ans.equals("")) {
 * } if else { 
 * scanner.close();
 */

import java.util.Random;
import java.util.Scanner;

public class ch3_じゃんけんゲーム {
    public static void main(String[] args) {

        System.out.println("じゃんけんしよう！");
        System.out.println("最初はグー！じゃんけん…");
        System.out.println("グー、チョキ、パー、一つを入力してください。");

        Scanner scanner = new Scanner(System.in);
        String ans = scanner.nextLine();

        String[] options = {"グー", "パー", "チョキ"};
        Random rand = new Random();
        String oa = options[rand.nextInt(3)]; //oa = opponent answer

        System.out.println("相手の手: " + oa);

        if (ans.equals("グー")) {
            if (oa.equals("グー")) {
                System.out.println("引き分けです。");
            } else if (oa.equals("パー")) {
                System.out.println("負けました。");
            } else if (oa.equals("チョキ")) {
                System.out.println("勝ちました！");
            }

        } else if (ans.equals("パー")) {
            if (oa.equals("グー")) {
                System.out.println("勝ちました！");
            } else if (oa.equals("パー")) {
                System.out.println("引き分けです。");
            } else if (oa.equals("チョキ")) {
                System.out.println("負けました。");
            }

        } else if (ans.equals("チョキ")) {
            if (oa.equals("グー")) {
                System.out.println("負けました。");
            } else if (oa.equals("パー")) {
                System.out.println("勝ちました！");
            } else if (oa.equals("チョキ")) {
                System.out.println("引き分けです。");
            }

        } else {
            System.out.println("無効な入力です。もう一度してください。");
        }

        scanner.close();
    }
}