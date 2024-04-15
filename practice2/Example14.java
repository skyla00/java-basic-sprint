package practice2;

public class Example14 {
    public static void main(String[] args) {
        Example12Person person1 = new Example12Person("하늘", 25);
        Example12Person person2 = new Example12Person("바다", 21);
        person1.introduce();
        person2.introduce();

        Example13Book book1 = new Example13Book("하하", "냠냠", 14000);
        book1.dataOfBook();

        StringUtil concat = new StringUtil();
        System.out.println(concat.concat("dms" ,"gk" ,"smf"));
        System.out.println(concat.concat("gk" ,"smf"));

    }
}
