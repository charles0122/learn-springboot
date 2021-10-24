package top.arce.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: bootstudy
 * @description: 汽车实体类
 * @author: charles
 * @create: 2021-10-24 15:19
 **/
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Car() {
    }

    private String brand;
    private int price;

}
