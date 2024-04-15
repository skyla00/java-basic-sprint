package practice2;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        // 숫자를 입력 받아
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        // 양수인지 음수인지 0인지를 판단하여 출력
            // 양수 num > 0
        if (num > 0 ) {
            System.out.println("양수입니다.");
            // num = 0
        } else if (num == 0) {
            System.out.println("0입니다.");
            // 음수 num < 0
        } else {
            System.out.println("음수입니다.");
        }



    }
}
