public class Person {
    private String name;

    public Person() {
        this.name = "Default Name";
    }

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
