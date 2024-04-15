package practice2;

import java.util.ArrayList;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        // 주어진 정수 배열을 콘솔에 받는다 가정.
        Scanner sc = new Scanner(System.in);
        // 정수의 갯수를 받아서 배열의 크기에 할당.
        System.out.printf("숫자의 총 갯수 : ");
        int count = sc.nextInt();

        // 정수를 입력 받고, 배열로 만들기.
        System.out.printf("숫자 : ");
        int [] numArray = new int[count] ;
        for (int i = 0; i <count ; i ++) {
            numArray[i] = sc.nextInt();
        }

        // 최댓값 구하기.
        int maxNum = numArray[0];
        for (int i = 0; i < count ; i++) {
            maxNum = Math.max(maxNum, numArray[i]);
        }

        // 최솟값 구하기.
        int minNum = numArray[0];
        for (int i = 0; i < count ; i++) {
            minNum = Math.min(minNum, numArray[i]);
        }

        System.out.printf("최대값: %d%n최소값: %d" , maxNum, minNum);


    }
    public static void printMaxMinNumber(int[] arr) {
        // arr배열을 정의한 거임.
        int max = arr[0];
        int min = arr[0];
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.printf("최대값: %d%n최소값: %d" , max, min);


        // 빈 배열
        // 요소가 하나일 때
    }
}
