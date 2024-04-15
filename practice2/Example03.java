package practice2;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        // 입력
        System.out.print("이름을 입력해주세요 : ");
        String name = input.nextLine();
        if (!isNameValue(name)) {
            System.out.println("이름에 문자를 입력해주세요");
            return;
        }

        System.out.print("나이를 입력해주세요 : ");
        String age = input.nextLine();
        if (!isNumValue(age)) {
            System.out.println("나이에 숫자를 입력해주세요");
            return;
        }

        System.out.println("이름은 : " + name);
        System.out.println("나이는 : " + age);

    }

    // 숫자이면 true 아니면 false;
    public static boolean isNumValue(String input) {
        char chr;

        for (int i = 0; i < input.length() ; i++) {
            chr = input.charAt(i);

            if(!Character.isDigit(chr)) {
                return false;
            }

        }

        return true;

    }

    public static boolean isNameValue(String input) {
        char chr;

        for (int i = 0; i < input.length() ; i++) {
            chr = input.charAt(i);

            if(!Character.isLetter(chr)) {
                return false;
            }

        }

        return true;

    }


}
