package practice2;

public class Example12Person {
    public String name;
    public int age;

    public Example12Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.printf("my name is %s, i'm %d years old.%n", name, age);
    }

}
