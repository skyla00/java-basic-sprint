package practice2;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 받을 값을 할당할 변수 2개 선언.
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();
        // 결과값 double result
        // string으로 받은 숫자를 double로 변환.
        // 사칙연산
        System.out.printf("%f 더하기 %f는 : %f%n", num1, num2, num1 + num2);
        System.out.printf("%f 빼기 %f는 : %f%n", num1, num2, num1 - num2);
        System.out.printf("%f 곱하기 %f는 : %f%n", num1, num2, num1 * num2);
        // 만약에 나눗셈이면
        // 두번째 숫자에 0이 오지 않아야 함.
        // "0으로는 나눌 수 없습니다." 예외메세지 발생 후 종료.
        // 아니면 결과 double 값을 출력.
        if (num2 ==0) {
            System.out.print("0으로는 나눌 수 없습니다.");
        } else {
            System.out.printf("%f 나누기 %f는 : %f%n", num1, num2, num1 / num2);
        }





    }
}
