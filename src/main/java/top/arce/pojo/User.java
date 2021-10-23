package top.arce.pojo;

/**
 * @program: bootstudy
 * @description: 用户实体类
 * @author: charles
 * @create: 2021-10-23 18:08
 **/
public class User {
    private int age;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
