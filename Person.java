package program;

public class Person {
    private int id;
    private String name;
    private String phone;
    private int age;
    public Person(int id, String name, String phone, int age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
