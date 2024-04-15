package practice2;

public class StringUtil {
    public String reverse(String input) {
        String reverseString = "";
        for (int i = input.length() -1 ; i >= 0; i --) {
            reverseString += input.charAt(i);
        }

        return reverseString;
    }

    public String concat(String str1, String str2) {
        String concatString = "";
        concatString = str1 + str2;
        return concatString;
    }

    public String concat(String str1, String str2, String str3) {
        String concatString = "";
        concatString = str1 + str2 + str3;
        return concatString;
    }

    public boolean contains(String str, char a) {
        for (int i= 0; i < str.length() ; i++) {
            if(str.charAt(i) == a) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(String str1, String str2) {
        for (int i= 0; i < str2.length() - str1.length() ; i++) {
            boolean isEqual = true;
            for (int j = i; j < i +str1.length(); j ++) {
              if (str2.charAt(i) != str1.charAt(j-i)) {
                  isEqual = false;
              }
            }
            if (isEqual) {
                return true;
            }

        }
        return false;
    }

}
