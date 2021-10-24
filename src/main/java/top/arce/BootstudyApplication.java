package top.arce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import top.arce.config.MyConfig;
import top.arce.pojo.User;

@SpringBootApplication
public class BootstudyApplication {

    public static void main(String[] args) {
        // 返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(BootstudyApplication.class, args);

        //查看容器内的所有组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        //从容器中获取组件
        User user01 = run.getBean("user01", User.class);
        System.out.println(user01);
        //查看配置类是否也是一个组件
        MyConfig myConfigBean = run.getBean(MyConfig.class);
        System.out.println(myConfigBean);
        User user = myConfigBean.user01();
        System.out.println(user);
        //通过调用容器中配置类的方法来返回一个实例
        System.out.println(user==user01);



    }


}
