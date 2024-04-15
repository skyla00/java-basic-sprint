package practice2;

public class Example02 {
    public static int add (int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static int sub (int num1, int num2) {
        int result;
        result = num1 - num2;
        return result;
    }

    public static int mul (int num1, int num2) {
        int result;
        result = num1 * num2;
        return result;
    }

    public static int div (int num1, int num2) {
        int result;
        result = num1 / num2;
        return result;
    }


    public static void main(String[] args) {
        System.out.println(add(4,2));
        System.out.println(sub(4,2));
        System.out.println(mul(4,2));
        System.out.println(div(4,2));
    }




}
