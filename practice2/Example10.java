package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        // 사용자로부터 5명의 학생의 점수를 입력받아
        Scanner sc = new Scanner(System.in);
        // 점수를 배열에 저장한 다음
        int[] scoreArray = new int[5];
        for (int i = 0; i < 5 ; i++) {
            scoreArray[i] = sc.nextInt();
        }
        // 평균점수 계산
        // 합을 먼저 계산하고 / 5 하기.
            // 1. for문을 돌리며 배열 안에 있는 값의 합 구하기.
            // 2. 평균을 받는 int값을 받아서 출력하기.
        int average;
        int sum = 0;
        for (int i = 0; i < 5 ; i++) {
            sum += scoreArray[i];
        }
        average = sum / 5;
        System.out.println(average);

    }
}
