package top.arce.config;

import ch.qos.logback.core.db.DBHelper;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import top.arce.pojo.Car;
import top.arce.pojo.Pet;
import top.arce.pojo.User;

/**
 * @program: bootstudy
 * @description: 自定义配置类
 * @author: charles
 * @create: 2021-10-23 18:23
 **/
//告诉spring 这是一个配置类 等同于以前写的配置文件
@Import({User.class, DBHelper.class})
//@ImportResource("classpath:beans.xml")
@Configuration(proxyBeanMethods=true)
@EnableConfigurationProperties(Car.class)
public class MyConfig {
    @Bean // 给容器中添加组件 以方法名为id 返回类型是组件类型 返回的值就是组件在容器中的实例
    public User user01(){
        return new User(18,"coral");
    }

    @Bean
    public Pet pet01(){
        return new Pet("Christine",10.0);
    }
}
