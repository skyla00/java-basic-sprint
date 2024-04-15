package practice2;

public class Example07 {
    public static void main(String[] args) {
        // 1~ 100 정수 중 짝수만 출력하는 프로그램 작성
        // 2부터짝수이므로 시작은 2
        // 범위는 100까지
        for (int i = 2; i <= 100 ; i += 2) {
            // 2로 나누었을 때 나누어떨어지면
            // 콘솔에 출력.
            // for문의 범위까지 반복
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
