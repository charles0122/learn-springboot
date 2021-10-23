package top.arce.pojo;

/**
 * @program: bootstudy
 * @description: 宠物实体类
 * @author: charles
 * @create: 2021-10-23 18:09
 **/
public class Pet {
    public Pet() {
    }

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
