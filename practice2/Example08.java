package practice2;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        // 사용자로부터 숫자 n을 부여받아
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //1부터 n까지의 합을 게산
        // 합한 값을 더할 곳. result
        int result = 0;
        // 범위는 1부터 n. 반복해야 함.
        // i를 1씩 더하며 result 값에서 더하기.
        for (int i = 1 ; i <= n ; i ++) {
            result += i;
        }

        //계산 된 값 출력.
        System.out.println(result);
    }
}
