public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public sayHello() {
        return String.format("%s says hello!", this.name);
    }


}
