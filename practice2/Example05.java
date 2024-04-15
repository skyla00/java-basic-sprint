package practice2;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("3개의 숫자를 입력하세요 : ");
        int[] numArray = new int[3];
        for (int i = 0; i < 3 ; i++) {
            numArray[i] = sc.nextInt();
        }

        //최소값을 구하는 방법.
        //최소값을 담을 변수 선언
        // index로 배열을 돌면서
        // 첫번재 입력값과 두번째 입력값을 비교해 더 큰 값을 최대값 변수에 할당
        int min = numArray[0];
        for (int num : numArray) {
            if (num < min ) {
                min = num;
            }
        }

        int max = numArray[0];
        for (int num : numArray) {
            if (num > max ) {
                max = num;
            }
        }

        System.out.printf("최소값은 %d, 최대값은 %d 입니다.", min, max);
    }
}
